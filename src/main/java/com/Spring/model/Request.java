package com.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "request")
public class Request {

    @Id
    private Long number;

    private String name;
    private String email;
    private String bloodGroup;
    private int units;
    private String date;
    private String hospital;
    private String contact;

    public Request() {}

    public Request(Long number, String name, String email, String bloodGroup, int units, String date, String hospital, String contact) {
        this.number = number;
        this.name = name;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.units = units;
        this.date = date;
        this.hospital = hospital;
        this.contact = contact;
    }

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

   
}
