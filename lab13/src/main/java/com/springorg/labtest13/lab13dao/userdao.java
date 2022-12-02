package com.springorg.labtest13.lab13dao;
import java.sql.SQLException;

public interface  userdao {
	//1.Create a User
	public int CreateUser(String user_name,String password)throws SQLException;
	//2.Update password
	public int CreatePassword(String user_name,String password)throws SQLException;
	//3.Delete a User
	public int deleteUser(String user_name)throws SQLException;
	//4.Retrieve a User
	public void retrieveUser(String user_name)throws SQLException;
	//5.List of all User
	public void listallUser(String user_name)throws SQLException;
	//6.Exit
	public void Exit()throws SQLException;
	//display user
	public void displayuser(String disp)throws SQLException;
	public void displayallluser()throws SQLException;
	public int updaetpass(String username, String password)throws SQLException; ;
	 
	
}
	
	