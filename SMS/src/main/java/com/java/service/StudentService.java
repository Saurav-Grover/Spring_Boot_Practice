package com.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.java.bean.Student;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<Student>(Arrays.asList(new Student(1, "John", "Computer Science"),
			new Student(2, "Linda", "Electronic"), new Student(3, "Maverick", "Information Technology")));

	public List<Student> viewAll() {
		return students;
	}

	public Student viewById(int id) {
		return students.stream().filter(s -> s.getId()==id).findFirst().get();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(int id,Student student) {
		for (Student stud1 : students) {
			if(stud1.getId()==id) {
				students.set(students.indexOf(stud1),student);
			}
		}
	}
	
	public void deleteById(int id) {
		
		students.removeIf(t -> t.getId()==id);
	}

}
