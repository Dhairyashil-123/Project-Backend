package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="DID")
	int did;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="pid")
	int pid;
	
	@Column(name="pname")
	String pname;
	
	@Column(name="dname")
	String dname;
	
	@Column(name="fees")
	float fees;
	
	@Column(name="appointmentDate")
	String appointmentDate;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Appointment(int did, int pid, String pname, String dname, float fees, String appointmentDate) {
		super();
		this.did = did;
		this.pid = pid;
		this.pname = pname;
		this.dname = dname;
		this.fees = fees;
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "Appointment [did=" + did + ", pid=" + pid + ", pname=" + pname + ", dname=" + dname + ", fees=" + fees
				+ ", appointmentDate=" + appointmentDate + "]";
	}
	
	public Appointment()
	{
		
	}
}
