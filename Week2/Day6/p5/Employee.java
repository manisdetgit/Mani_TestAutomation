package com.p5;

public class Employee {
	private int eid;
	private String name;
	
	protected Employee(){
		
	}
	
	protected Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		final Employee obj = new Employee();
		
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displaye() {
		System.out.println("Employee id: "+eid+" name: "+name);
	}
	
	
	
}

 class PermanentEmployee extends Employee{
	private float salary;
	private String addr;
	
	public PermanentEmployee(int empid, String name, float salary, String addr) {
		super(empid,name); //calls base class default constructor
		this.salary = salary;
		this.addr = addr;
	}

		
	public float getSalary() {
		
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	} 

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
final void salTest() {
	final int sal = 10000;
	System.out.println("sal: " + sal);
}
	
	void displayp() {
		displaye();
		System.out.println("Salary: "+salary+" Address: "+addr);
		salTest();
	}
	
}
