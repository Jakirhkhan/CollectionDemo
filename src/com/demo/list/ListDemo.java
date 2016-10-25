package com.demo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.model.Student;

public class ListDemo {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student(1001, "Jakir Hosen Khan", "Khilket,Dhaka"));
		stdList.add(new Student(1002, "Rajaul Karim", "Mirpur,Dhaka"));
		stdList.add(new Student(1003, "Bashir", "Dhanmondi,Dhaka"));

		System.out.println("Printing list....");
		System.out.println(stdList);
		
		System.out.println("Iterating list....");
		Iterator<Student> stdItr = stdList.iterator();
		while(stdItr.hasNext()){
			System.out.println(stdItr.next());
		}
	}

}
