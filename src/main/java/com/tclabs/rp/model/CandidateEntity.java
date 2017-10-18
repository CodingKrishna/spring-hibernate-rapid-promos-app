package com.tclabs.rp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidateDetails")
public class CandidateEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "Id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile")
	private long mobile;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "location")
	private String location;

	public CandidateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateEntity(long id, String name, long mobile, String email,
			String location) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
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

	@Override
	public String toString() {
		return "CandidateEntity [id=" + id + ", name=" + name + ", mobile="
				+ mobile + ", email=" + email + ", location=" + location + "]";
	}
	
}
