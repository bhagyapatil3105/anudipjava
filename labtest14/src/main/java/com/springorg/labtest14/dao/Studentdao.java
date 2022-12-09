package com.springorg.labtest14.dao;

import java.sql.SQLException;

import com.springorg.labtest14.entities.Student;

public interface Studentdao {
	void insertStudent( Student s) throws SQLException;
	 Student  getStudent( int id) throws SQLException;
	 boolean deleteStudent(int id) throws SQLException;
      boolean updateStudent(int id,String name) throws SQLException;


}
