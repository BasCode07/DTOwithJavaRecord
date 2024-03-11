package com.bascode;

public class StudentMapper {
   public static StudentDTO mapToStudent(Student student) {
	   StudentDTO studentDTO
	   = new StudentDTO(student.getId(),student.getUserName()
			   ,student.getPosition(),student.getTech());
	   return studentDTO;
   }
}
