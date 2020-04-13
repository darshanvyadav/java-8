package com.yadav.javaeight.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MainComparator {

	public static void main(String[] args) {
		Function<Person, Integer> returnAge = P -> P.getAge(); 
		Function<Person,String> returnLastName = P -> P.getLastName(); 
		Function<Person, String>returnFirstName = P -> P.getFirstName();

		// my implementation
		Compatator<Person> cmpPersonAge = Compatator.comparing(Person::getAge);
		Compatator<Person> cmpPersonLastName = Compatator.comparing(Person::getFirstName);
		Compatator<Person> cmpPersonFirstName = Compatator.comparing(Person::getFirstName);
		
		// java implementation
		Comparator<Person> cpAge = Comparator.comparing(Person::getAge);
		Comparator<Person> cpLastName = Comparator.comparing(Person::getLastName);
		Comparator<Person> cpFirstName = Comparator.comparing(Person::getFirstName);

		
		List<Person> personList = getPersonList();
		System.out.println(personList);
		personList.sort(cpAge);
		System.out.println(personList);
		
		 
		
	}

	private static List<Person> getPersonList() {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setAge(24);
		p1.setFirstName("Supriya");
		p1.setLastName("Nakerikanti");
		
		p2.setAge(27);
		p2.setFirstName("Darshan");
		p2.setLastName("Yadav");
		
		p3.setAge(10);
		p3.setFirstName("our");
		p3.setLastName("kid");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		return personList;
	}

}
