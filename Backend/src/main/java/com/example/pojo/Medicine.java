package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="medicalid")
	int medicalid;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="medicineid")
	int medicineid;
	
	@Column(name ="medicinename")
	String medicinename;
	
	@Column(name ="price")
	float price;
	
	@Column(name ="medicalname")
	String medicalname;
	
	@Column(name="stock")
	String stock;

	public int getMedicalid() {
		return medicalid;
	}

	public void setMedicalid(int medicalid) {
		this.medicalid = medicalid;
	}

	public int getMedicineid() {
		return medicineid;
	}

	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMedicalname() {
		return medicalname;
	}

	public void setMedicalname(String medicalname) {
		this.medicalname = medicalname;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Medicine(int medicalid, int medicineid, String medicinename, float price, String medicalname, String stock) {
		super();
		this.medicalid = medicalid;
		this.medicineid = medicineid;
		this.medicinename = medicinename;
		this.price = price;
		this.medicalname = medicalname;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Medicine [medicalid=" + medicalid + ", medicineid=" + medicineid + ", medicinename=" + medicinename
				+ ", price=" + price + ", medicalname=" + medicalname + ", stock=" + stock + "]";
	}
	
	public Medicine()
	{
		
	}
	
}
