package com.springorg.StudentMgtDao;

import java.util.List;
//import com.springorm.StudentMgt.entities.Student;

import com.springorg.entities.Student;

public interface StudentDao {
	public int insertStudent(Student s);

	public int updateStudent(Student s);

	public int deleteStudent(Student s);
	
	public Student getStudent(int id);

	public List<Student> getAllStudent();

}
