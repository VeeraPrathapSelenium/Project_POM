package com.constructorExample;

public class DPS extends School{

	DPS(String name, int age, String classname) {
		super(name, age, classname);
		
	}
	
	public void add_Student_Music()
	{
		System.out.println("Student :"+super.name+ " is added to the Music class");
	}

}
