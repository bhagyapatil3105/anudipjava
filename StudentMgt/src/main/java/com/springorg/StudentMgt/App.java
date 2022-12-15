package com.springorg.StudentMgt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorg.StudentMgtDao.StudentDao;
import com.springorg.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		StudentDao ddao = (StudentDao) ac.getBean("Stdao");
		Student st = new Student(1,"Annu");
		Student st1 = new Student(2, "Sayu");
		Student st2 = new Student(3, "Sayli");
		
		

		ddao.insertStudent(st);
		ddao.insertStudent(st1);
		ddao.insertStudent(st2);

		List<Student> slist = ddao.getAllStudent();

		System.out.println(slist);
		

    }
}
