package com.spring.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
   @Id
   int empid;
   String ename;
   Double salary;
   public Employee() {}
public Employee(int empid, String ename, Double salary) 
{
	this.empid = empid;
	this.ename = ename;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
}
