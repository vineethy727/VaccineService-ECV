package com.vaccine.entity;

import java.util.List;

import com.vaccine.model.VaccineCenter;

public class RequiredResponse {

	private VaccineCenter vc;
	private List<Citizen> citizen;
	public RequiredResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequiredResponse(VaccineCenter vc, List<Citizen> citizen) {
		super();
		this.vc = vc;
		this.citizen = citizen;
	}
	public VaccineCenter getVc() {
		return vc;
	}
	public void setVc(VaccineCenter vc) {
		this.vc = vc;
	}
	public List<Citizen> getCitizen() {
		return citizen;
	}
	public void setCitizen(List<Citizen> citizen) {
		this.citizen = citizen;
	}
	@Override
	public String toString() {
		return "RequiredResponse [vc=" + vc + ", citizen=" + citizen + "]";
	}
	
	
	
	
}
