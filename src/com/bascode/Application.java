package com.bascode;

import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		
		Student student 
		= new Student(1,"bascode-dev",
				"Bakare Samson","345csd37"
				,200000,List.of("java","angular","springboot"),"developer");
		student.setUserName("samcoder-dev");
		
	System.out.println(student);
	System.out.println(StudentMapper.mapToStudent(student));
		
	}	

}
