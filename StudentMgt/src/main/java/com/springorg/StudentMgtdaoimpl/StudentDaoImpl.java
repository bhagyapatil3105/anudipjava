package com.springorg.StudentMgtdaoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorg.StudentMgtDao.StudentDao;
import com.springorg.entities.Student;

public class StudentDaoImpl implements StudentDao {
	

	private HibernateTemplate ht;

	public int insertStudent(Student s) {
		int id =  (Integer) ht.save(s);
		return 1;
	}

	public int updateStudent(Student s) {
		ht.update(s);
		return 1;
	}

	public int deleteStudent(Student s) {
		ht.delete(s);
		return 1;
	}

	public Student getStudent(int id) {
		Student dept = ht.get(Student.class, id);
		return dept;
	}

	public List<Student> getAllStudent() {
		List<Student> deptList = ht.loadAll(Student.class);
		return deptList;
	}
		
		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}
	
}


