package com.tclabs.rp.dto;

public class CandidateDto {
	private String candiadte;
	private Long mobile;
	private String email;
	private String location;
	public String getCandiadte() {
		return candiadte;
	}
	public void setCandiadte(String candiadte) {
		this.candiadte = candiadte;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile; 
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public CandidateDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateDto( String candiadte, String education,
			String yearOfPassing, String skillSet, Long mobile, String email,
			String location) {
		super();
		this.candiadte = candiadte;
		this.mobile = mobile;
		this.email = email;
		this.location = location;
	}
	@Override
	public String toString() {
		return "CandidateDto [candiadte=" + candiadte + ", mobile=" + mobile
				+ ", email=" + email + ", location=" + location +  "]";
	}
	
}
