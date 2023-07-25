package com.vaccine.service;

import com.vaccine.entity.RequiredResponse;
import com.vaccine.model.VaccineCenter;

public interface VaccineService {

	public String test();
	public VaccineCenter addcenter(VaccineCenter vc);
	public void deleteCenter(Integer id);
	public VaccineCenter getOneCenter(Integer id);
	public RequiredResponse getAllCenter(Integer id);
	
	
}
