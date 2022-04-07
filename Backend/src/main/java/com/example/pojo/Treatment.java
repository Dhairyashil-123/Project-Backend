package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "treatment")
public class Treatment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="DID")
	int did;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="pid")
	int pid;
	
	@Column(name="dname")
	String dname;
	
	@Column(name="pname")
	String pname;
	
	@Column(name="prescription_or_justcheck")
	String prescription_or_justcheck;
	
	@Column(name="date")
	String date;
	
	@Column(name="dolab_or_not")
	String dolab_or_not;
	
	@Column(name="nextappointment")
	String nextappointment;

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

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrescription_or_justcheck() {
		return prescription_or_justcheck;
	}

	public void setPrescription_or_justcheck(String prescription_or_justcheck) {
		this.prescription_or_justcheck = prescription_or_justcheck;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDolab_or_not() {
		return dolab_or_not;
	}

	public void setDolab_or_not(String dolab_or_not) {
		this.dolab_or_not = dolab_or_not;
	}

	public String getNextappointment() {
		return nextappointment;
	}

	public void setNextappointment(String nextappointment) {
		this.nextappointment = nextappointment;
	}

	public Treatment(int did, int pid, String dname, String pname, String prescription_or_justcheck, String date,
			String dolab_or_not, String nextappointment) {
		super();
		this.did = did;
		this.pid = pid;
		this.dname = dname;
		this.pname = pname;
		this.prescription_or_justcheck = prescription_or_justcheck;
		this.date = date;
		this.dolab_or_not = dolab_or_not;
		this.nextappointment = nextappointment;
	}

	@Override
	public String toString() {
		return "Treatment [did=" + did + ", pid=" + pid + ", dname=" + dname + ", pname=" + pname
				+ ", prescription_or_justcheck=" + prescription_or_justcheck + ", date=" + date + ", dolab_or_not="
				+ dolab_or_not + ", nextappointment=" + nextappointment + "]";
	}
	
	public Treatment()
	{
		
	}
}
