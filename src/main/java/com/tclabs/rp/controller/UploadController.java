package com.tclabs.rp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tclabs.rp.dto.CandidateDto;
import com.tclabs.rp.dto.UploadDto;
import com.tclabs.rp.dto.UploadStatus;
import com.tclabs.rp.service.UploadService;

@Controller
public class UploadController {
	@Autowired
	@Qualifier("uploadServiceImpl")
	UploadService uploadService;
	
	@RequestMapping("getHomePage")
	public String getHomePage() {
		return "homePage";
	}
	
	@RequestMapping(value = "uploadFile", method = RequestMethod.POST)
	public String uploadFile(@ModelAttribute("uploadDto") UploadDto uploadDto, Model map) throws IOException {
		System.out.println("File Name : "+uploadDto.getFile().getInputStream());
		
		List<CandidateDto> listCandidates = new ArrayList<CandidateDto>();
		
		InputStream fin = uploadDto.getFile().getInputStream();
		File uploadedFile = new File("F:\\XlData\\" + uploadDto.getFile().getOriginalFilename());
		FileOutputStream outputStream = new FileOutputStream(uploadedFile);

		int read = 0;
		byte[] bytes = new byte[1024];

		while ((read = fin.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
		outputStream.close();
		map.addAttribute("file", uploadDto.getFile().getOriginalFilename());
		map.addAttribute("uploadedFile", uploadedFile.getAbsoluteFile());

		
	    FileInputStream inputStream = new FileInputStream(new File("F:\\XlData\\Pioneer Coders  Candidates Resumes list.xlsx"));
	 
	    Workbook workbook = new XSSFWorkbook(inputStream);
	    Sheet firstSheet = workbook.getSheetAt(0); 
/*	    Iterator<Row> rows = firstSheet.rowIterator();
	 
	    while (rows.hasNext()) {
	    Row nextRow = rows.next();  */
	    
		for (int i = 1; i <= firstSheet.getLastRowNum(); i++) {
			
			Row	rows =firstSheet.getRow(i);
			Iterator<Cell> cellIterator = rows.cellIterator();
	        CandidateDto candiadateDto = new CandidateDto();
	 
	        while (cellIterator.hasNext()) {
	            Cell nextCell = cellIterator.next();
	            int columnIndex = nextCell.getColumnIndex();
	 
	            switch (columnIndex) { 
	            case 1:
	            	candiadateDto.setCandiadte((String) getCellValue(nextCell).toString());
	                break;
	            case 2:
	            	long mobile = new Double((double) getCellValue(nextCell)).longValue();
	            	candiadateDto.setMobile(mobile);
	                break;
	            case 3:
	            	candiadateDto.setEmail((String) getCellValue(nextCell));
	                break;
	            case 4:
	            	candiadateDto.setLocation((String) getCellValue(nextCell));
	                break;
	            }
	        }
	        listCandidates.add(candiadateDto);
		}
		/*}
	     ((Closeable) workbook).close();*/
	    inputStream.close();
		
	    uploadService.insertCandidateList(listCandidates);
	    
	    System.out.println("ListOfCandidatesData :"+listCandidates);
	    
		return "homePage";
		
	}

	private Object getCellValue(Cell cell) {
	    switch (cell.getCellType()) {
	    case Cell.CELL_TYPE_STRING:
	        return cell.getStringCellValue();
	 
	    case Cell.CELL_TYPE_BOOLEAN:
	        return cell.getBooleanCellValue();
	 
	    case Cell.CELL_TYPE_NUMERIC:
	        return cell.getNumericCellValue();
	        
	    }
	 
	    return null;
	}
	
	@RequestMapping(value = "uploadPhoto", method = RequestMethod.POST)
	public String getUploadPhoto(@ModelAttribute("uploadDto") UploadDto uploadDto) throws IOException {
		//System.out.println("Image Name : "+uploadDto.getFile().getInputStream());
		return "uploadPhoto";
	}
	
	@RequestMapping(value = "uploadStatus",method = RequestMethod.POST)
	public String getUploadsStatus(@ModelAttribute("uploadStatus") UploadStatus uploadStatus) {
		System.out.println("status : "+uploadStatus.getStatus());
		return null;
		
	}
	
	
}
