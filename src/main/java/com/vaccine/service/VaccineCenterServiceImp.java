package com.vaccine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vaccine.entity.Citizen;
import com.vaccine.entity.RequiredResponse;
import com.vaccine.model.VaccineCenter;
import com.vaccine.repository.VaccineCenterRepo;

@Service
public class VaccineCenterServiceImp implements VaccineService {

	@Autowired
	private VaccineCenterRepo vcr;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String test() {
		return "welcome to vaccine center services";
	}

	@Override
	public VaccineCenter addcenter(VaccineCenter vc) {
		
		return vcr.save(vc);
	}

	@SuppressWarnings("unchecked")
	@Override
	public RequiredResponse getAllCenter(Integer cenid) {
		
		RequiredResponse requiredResponse=new RequiredResponse ();
		  // 1st Get  Vaccination Center Details
		  VaccineCenter center=vcr.findById(cenid).get();
		  requiredResponse.setVc(center);
		
		 // @SuppressWarnings("unchecked")
		List<Citizen> listOfCitizens=restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/"+cenid,List.class);
			 requiredResponse.setCitizen(listOfCitizens);
		  
		return requiredResponse;
	}
	
	
	
	@Override
	public void deleteCenter(Integer cenid) {
		vcr.deleteById(cenid);

	}

	@Override
	public VaccineCenter getOneCenter(Integer id) {
		
		return vcr.findById(id).get();
	}

	

}
