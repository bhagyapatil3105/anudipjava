package com.string;

public class InvalidmailidExcepti {
 
String name;
  String email;
  public InvalidmailidExcepti(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidMailIdException{
		if((email.endsWith("@")||email.endsWith("."))||email.endsWith(" "))
			throw new InvalidMailIdException("enter valid email");
	
	 this.email = email;
	}

	
	}


