package com.mybatis.join.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class EmployeesVO {

	private int employee_ID;
	private String first_Name;
	private String last_Name;
	private String email;
	private String phone_Number;
	private Date hire_Date;
	private String job_ID;
	private int salary;
	private int commission_Pct;
	private int manager_ID;
	private int department_ID;
	
	public EmployeesVO () {}
	
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	public Date getHire_Date() {
		return hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		this.hire_Date = hire_Date;
	}
	public String getJob_ID() {
		return job_ID;
	}
	public void setJob_ID(String job_ID) {
		this.job_ID = job_ID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission_Pct() {
		return commission_Pct;
	}
	public void setCommission_Pct(int commission_Pct) {
		this.commission_Pct = commission_Pct;
	}
	public int getManager_ID() {
		return manager_ID;
	}
	public void setManager_ID(int manager_ID) {
		this.manager_ID = manager_ID;
	}
	public int getDepartment_ID() {
		return department_ID;
	}
	public void setDepartment_ID(int department_ID) {
		this.department_ID = department_ID;
	}

	@Override
	public String toString() {
		return "EmployeesVO [employee_ID=" + employee_ID + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", email=" + email + ", phone_Number=" + phone_Number + ", hire_Date=" + hire_Date + ", job_ID="
				+ job_ID + ", salary=" + salary + ", commission_Pct=" + commission_Pct + ", manager_ID=" + manager_ID
				+ ", department_ID=" + department_ID + "]";
	}
	
	
	
	
	
}
