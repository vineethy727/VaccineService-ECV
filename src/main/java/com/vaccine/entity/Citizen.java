package com.vaccine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="citizenName", columnDefinition="varchar(40)")
	private String citizenName;
	private int vacCentreId;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(Integer id, String citizenName, int vacCentreId) {
		super();
		this.id = id;
		this.citizenName = citizenName;
		this.vacCentreId = vacCentreId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getcitizenName() {
		return citizenName;
	}
	public void setcitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public int getVacCentreId() {
		return vacCentreId;
	}
	public void setVacCentreId(int vacCentreId) {
		this.vacCentreId = vacCentreId;
	}
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", citizenName=" + citizenName + ", vacCentreId=" + vacCentreId + "]";
	}
	
	
}
