package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ Component
public class Employee {
	

	private int empid;
	private String empNmae;
	private String branch;
	@Autowired
	private Laptop laptop;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{ 
		System.out.println("in show");
		laptop.compile();
	}
	

}
