package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medical")
public class Medical {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="medicalid")
	int medicalid;
	
	@Column(name ="medicalname")
	String medicalname;
	
	@Column(name ="medicalcity")
	String medicalcity;
	
	@Column(name ="medicaladdress")
	String medicaladdress;
	
	@Column(name ="availability")
	String availability;
	
	@Column(name="stock")
	String stock;

	public int getMedicalid() {
		return medicalid;
	}

	public void setMedicalid(int medicalid) {
		this.medicalid = medicalid;
	}

	public String getMedicalname() {
		return medicalname;
	}

	public void setMedicalname(String medicalname) {
		this.medicalname = medicalname;
	}

	public String getMedicalcity() {
		return medicalcity;
	}

	public void setMedicalcity(String medicalcity) {
		this.medicalcity = medicalcity;
	}

	public String getMedicaladdress() {
		return medicaladdress;
	}

	public void setMedicaladdress(String medicaladdress) {
		this.medicaladdress = medicaladdress;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Medical(int medicalid, String medicalname, String medicalcity, String medicaladdress, String availability,
			String stock) {
		super();
		this.medicalid = medicalid;
		this.medicalname = medicalname;
		this.medicalcity = medicalcity;
		this.medicaladdress = medicaladdress;
		this.availability = availability;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Medical [medicalid=" + medicalid + ", medicalname=" + medicalname + ", medicalcity=" + medicalcity
				+ ", medicaladdress=" + medicaladdress + ", availability=" + availability + ", stock=" + stock + "]";
	}
	
	public Medical()
	{
		
	}
}
