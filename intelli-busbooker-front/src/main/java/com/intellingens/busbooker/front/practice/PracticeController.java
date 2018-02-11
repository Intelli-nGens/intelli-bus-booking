package com.intellingens.busbooker.front.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intellingens.busbooker.biz.practice.PracticeService;

@RestController
public class PracticeController {

	@Autowired
	PracticeService service;
	
	
	@RequestMapping(method= {RequestMethod.POST},value="/index")
	public void save(@RequestBody String name) {
		 service.addPersons(name);
	}
	
	@RequestMapping("/index")
	public String getAllPerson() {
		return  service.getAllPersons().toString();
	}
	
}
