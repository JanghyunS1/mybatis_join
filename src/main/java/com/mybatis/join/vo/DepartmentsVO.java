package com.mybatis.join.vo;

import org.springframework.stereotype.Component;

@Component
public class DepartmentsVO {

	private int department_ID;
	private String department_Name;
	private int manager_ID;
	private int location_ID;
	
	public DepartmentsVO () {}
	
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
	public int getManager_ID() {
		return manager_ID;
	}
	public void setManager_ID(int manager_ID) {
		this.manager_ID = manager_ID;
	}
	public int getLocation_ID() {
		return location_ID;
	}
	public void setLocation_ID(int location_ID) {
		this.location_ID = location_ID;
	}

	@Override
	public String toString() {
		return "DepartmentsVO [department_ID=" + department_ID + ", department_Name=" + department_Name
				+ ", manager_ID=" + manager_ID + ", location_ID=" + location_ID + "]";
	}
	
	
	
}
