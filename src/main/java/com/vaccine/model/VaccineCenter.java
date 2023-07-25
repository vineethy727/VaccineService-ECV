package com.vaccine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VaccineCenter {

	@Id
	private int cenid;
	@Column(name="centerName", columnDefinition="varchar(40)")
	private String centerName;
	@Column(name="centerAddress", columnDefinition="varchar(40)")
	private String centerAddress;
	public VaccineCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VaccineCenter(int cenid, String centerName, String centerAddress) {
		super();
		this.cenid = cenid;
		this.centerName = centerName;
		this.centerAddress = centerAddress;
	}
	public int getCenid() {
		return cenid;
	}
	public void setCenid(int cenid) {
		this.cenid = cenid;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterAddress() {
		return centerAddress;
	}
	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}
	@Override
	public String toString() {
		return "VaccineCenter [cenid=" + cenid + ", centerName=" + centerName + ", centerAddress=" + centerAddress
				+ "]";
	}
	
	
	
}
