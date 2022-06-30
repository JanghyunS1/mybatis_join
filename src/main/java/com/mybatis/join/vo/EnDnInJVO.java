package com.mybatis.join.vo;

import java.util.Date;

public class EnDnInJVO {

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
	private String department_Name;
	private int location_ID;
	private String street_Address;
	private String postal_Code;
	private String city;
	private String state_Province;
	private String country_ID;
	private Date start_Date;
	private Date end_Date;
	
	public EnDnInJVO () {}
	
	// getter setter
	
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
	public String getDepartment_Name() {
		return department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}
	public int getLocation_ID() {
		return location_ID;
	}
	public void setLocation_ID(int location_ID) {
		this.location_ID = location_ID;
	}
	public String getStreet_Address() {
		return street_Address;
	}
	public void setStreet_Address(String street_Address) {
		this.street_Address = street_Address;
	}
	public String getPostal_Code() {
		return postal_Code;
	}
	public void setPostal_Code(String postal_Code) {
		this.postal_Code = postal_Code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_Province() {
		return state_Province;
	}
	public void setState_Province(String state_Province) {
		this.state_Province = state_Province;
	}
	public String getCountry_ID() {
		return country_ID;
	}
	public void setCountry_ID(String country_ID) {
		this.country_ID = country_ID;
	}
	public Date getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	@Override
	public String toString() {
		return "EnDnInJVO [employee_ID=" + employee_ID + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", email=" + email + ", phone_Number=" + phone_Number + ", hire_Date=" + hire_Date + ", job_ID="
				+ job_ID + ", salary=" + salary + ", commission_Pct=" + commission_Pct + ", manager_ID=" + manager_ID
				+ ", department_ID=" + department_ID + ", department_Name=" + department_Name + ", location_ID="
				+ location_ID + ", street_Address=" + street_Address + ", postal_Code=" + postal_Code + ", city=" + city
				+ ", state_Province=" + state_Province + ", country_ID=" + country_ID + ", start_Date=" + start_Date
				+ ", end_Date=" + end_Date + "]";
	}
	
	
	
	
}
