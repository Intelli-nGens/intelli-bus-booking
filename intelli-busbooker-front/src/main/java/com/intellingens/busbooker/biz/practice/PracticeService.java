package com.intellingens.busbooker.biz.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PracticeService {

	private static List<String> listOfPersons = new ArrayList<>(Arrays.asList("Commander"));
	
	public void addPersons(String person) {
		listOfPersons.add(person);
	}

	public  List<String> getAllPersons() {
		// TODO Auto-generated method stub
		return listOfPersons;
	}
}
