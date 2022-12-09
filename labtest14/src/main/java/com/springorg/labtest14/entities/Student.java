package com.springorg.labtest14.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
@Entity
@Table(name="Student_details")
public class Student {
	public Student(int st_id, String sname, String contact) {
		super();
		this.st_id = st_id;
		this.sname = sname;
		this.contact = contact;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	
	private int st_id;
	@Column(length=50,nullable=false)
    private  String sname;
	@Column(length=10,nullable=false,unique=true)
	
   private  String contact;
@Override
public String toString() {
	return "Student [st_id=" + st_id + ", sname=" + sname + ", contact=" + contact + "]";
}
public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
} 


}
