package com.springorg.labtest14;

import java.sql.SQLException;
import java.util.Scanner;

import com.springorg.labtest14.dao.Studentdao;
import com.springorg.labtest14.daoimpl.Studentdaoimpl;
import com.springorg.labtest14.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException 
    {
    	Studentdao sdao=new Studentdaoimpl();
		System.out.println("enter choice 1.Add Student 12.See Student details");
		Scanner sc = new Scanner(System.in);
		Student s;
		int id;
		int i = sc.nextInt();
		switch (i) {
		case 1:
          s=new Student();
          s.setSt_id(1);
          s.setSname("Anay");
          s.setContact("9889509478");
          sdao.insertStudent(s);
          
			break;
		case 2:
			 id=sc.nextInt();
            s=sdao.getStudent(id);
            System.out.println(s);
			break;
		case 3:
			 id=sc.nextInt();
            sdao.deleteStudent(id);
			break;
		case 4:
			 id=sc.nextInt();
			 String name="Arya";
            sdao.updateStudent(id, name);
           
			break;
		default:
			sc.close();
			break;
		}
	}

    }

