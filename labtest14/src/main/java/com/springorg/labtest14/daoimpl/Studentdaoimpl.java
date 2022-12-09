package com.springorg.labtest14.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.springorg.labtest14.dao.Studentdao;
import com.springorg.labtest14.entities.Student;
import com.springorg.labtest14.util.HiberUtil;

public class Studentdaoimpl implements Studentdao { 
	Session s= HiberUtil.getSession();
    Transaction tx;
	public void insertStudent1(Student S) {
		tx=s.beginTransaction();
		s.save(S);
		tx.commit();
	}
	public void insertStudent(Student S) {
		tx=s.beginTransaction();
		s.save(S);
		tx.commit();
	}

	public Student getStudent(int id) {
		return s.get(Student.class, id);
	}

	public boolean deleteStudent(int id) {
		tx=s.beginTransaction();
		Student s1=s.get(Student.class, id);
		s.delete(s);
		tx.commit();
		s.close();
		return true;
	}

	public boolean updateStudent(int id,String name) {
		tx=s.beginTransaction();
		Student s1=s.get(Student.class, id);
		s1.setSname(name);;
		s.update(s1);
		tx.commit();
		s.close();
		return false;
	}
	

}
