package com.springorg.StudentMgt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.springorg.StudentMgtDao.StudentDao;
import com.springorg.entities.Student;

public class StudentTest {
	static StudentDao sdao;
	
	public static void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		sdao = (StudentDao) ac.getBean("Stdao");
		
	}
	@Test
	public void testGetStudent() {
		//positive case
		Student st = sdao.getStudent(4);
		assertEquals(4, st.getSid());
	}
	
	@Test
	public void testUpdateStudent() {
		//negative case
		Student st = sdao.getStudent(1);
		st.setSname("Shalini");
		assertEquals(1, sdao.updateStudent(st));
	}

} 

}
