package com.constructorExample;

public class School {
	
	
String name;

int age;

String classname;

static int rollnumber;


School(String name,int age,String classname)
{
	this.name=name;
	this.age=age;
	this.classname=classname;
	
	rollnumber++;
}


public void addStudent()
{
	System.out.println("The Student :"+name +" is added in the class :"+classname+" with rol number :"+rollnumber);
}

public void deleteStudent()
{
	System.out.println("The Student :"+name +" is deleted in the class :"+classname+" with rol number :"+rollnumber);
}







}
