package org.tnsif.acc.c2tc.springautowiring;

public class Student {
	
	Address address;
	
	public Student(Address address)
	{
		this.address=address;
	}
	public void display()
	{
		System.out.println("Student Address");
		address.showAddress();
	}
}
