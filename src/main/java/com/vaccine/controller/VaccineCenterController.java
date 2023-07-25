package com.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaccine.entity.RequiredResponse;
import com.vaccine.model.VaccineCenter;
import com.vaccine.service.VaccineService;

@RestController
@RequestMapping("/vaccineCenter")
public class VaccineCenterController {

	@Autowired
	private VaccineService vcs;
	
	@GetMapping("/test")
	public ResponseEntity<String> test()
	{
		String s=vcs.test();
		
		return new ResponseEntity<>(s,HttpStatus.OK);
	}

	 @PostMapping("/add")
	 public ResponseEntity<VaccineCenter> addCenter(@RequestBody VaccineCenter newCenter)
	 {
		 VaccineCenter center=vcs.addcenter(newCenter);
	  return new ResponseEntity<>(center,HttpStatus.OK);
	 }
	 
	 @GetMapping("/id/{cenid}")
	 public ResponseEntity<RequiredResponse> getAllDatabaseonCenterId(@PathVariable Integer cenid)
	 {
//	  RequiredResponse requiredResponse=new RequiredResponse ();
//	  // 1st Get  Vaccination Center Details
//	  VaccineCenter center=centerRepo.findById(id).get();
//	  requiredResponse.setCenter(center);
//	  return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK);
//	  
	 /* // Then Get citizen registered to Vaccination Details
	 List<Citizen> listOfCitizens=restTemplate.getForObject("http://localhost:8001/citizen/id/"+id,List.class);
	 requiredResponse.setCitizens(listOfCitizens);*/
	 
	 RequiredResponse rr=vcs.getAllCenter(cenid);
	 
	  return new ResponseEntity<RequiredResponse>(rr,HttpStatus.OK);  
	 }
	
	 @DeleteMapping("/deleteCenter/{cenid}")
	 public String deleteCenter(@PathVariable Integer cenid)
	 {
		 vcs.deleteCenter(cenid);
		 return "center deleted sucessfully";
	 }
	 
	 @GetMapping("/getCenterDetails/{cenid}")
	 public VaccineCenter getOneCenter(@PathVariable Integer cenid)
	 {
		 VaccineCenter vcd=vcs.getOneCenter(cenid);
		 return vcd;
	 }
}
