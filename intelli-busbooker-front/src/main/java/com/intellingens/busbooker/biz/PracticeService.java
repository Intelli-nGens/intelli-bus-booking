package com.intellingens.busbooker.biz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.intellingens.busbooker.bizcore.entity.BusDetailsEntity;

@Service
public class PracticeService {

	private static List<String> listOfPersons = new ArrayList<>(Arrays.asList("Commander"));

	public void addPersons(String person) {
		listOfPersons.add(person);
	}

	public  List<String> getAllPersons() {
BusDetailsEntity f=BusDetailsEntity.builder()
					.id(UUID.randomUUID())
					.isAc(true)
					.build();
		return listOfPersons;
	}
}
