package com.demo.basic;

import com.demo.model.Student;

public class MethodOverriding {

	public static void main(String[] args) {
		Student std1 = new Student(1,"Abc","Dhaka");
		Student std2 = new Student(1,"Xyz","Dhaka");
		Student std3 = std2;
		if(std1 == std2){
			System.out.println("std3 == std2");
		}
		if(std1.equals(std2)){ //Check with id
			System.out.println("std1.equals(std2)");
		}
	}

}
