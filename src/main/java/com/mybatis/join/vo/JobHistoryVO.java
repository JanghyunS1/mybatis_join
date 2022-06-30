package com.mybatis.join.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class JobHistoryVO {

	private int employee_ID;
	private Date start_Date;
	private Date end_Date;
	private String job_ID;
	private int department_ID;
	
	public JobHistoryVO () {}
	
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
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
	public String getJob_ID() {
		return job_ID;
	}
	public void setJob_ID(String job_ID) {
		this.job_ID = job_ID;
	}
	public int getDepartment_ID() {
		return department_ID;
	}
	public void setDepartment_ID(int department_ID) {
		this.department_ID = department_ID;
	}
	
	@Override
	public String toString() {
		return "JobHistoryVO [employee_ID=" + employee_ID + ", start_Date=" + start_Date + ", end_Date=" + end_Date
				+ ", job_ID=" + job_ID + ", department_ID=" + department_ID + "]";
	}
	
	
	
}
