package com.mybatis.join.vo;

public class AllJoinVO {

	private DepartmentsVO depts;
	private EmployeesVO emps;
	private JobHistoryVO job;
	private LocationsVO location;
	
	public AllJoinVO () {}

	public DepartmentsVO getDepts() {
		return depts;
	}

	public void setDepts(DepartmentsVO depts) {
		this.depts = depts;
	}

	public EmployeesVO getEmps() {
		return emps;
	}

	public void setEmps(EmployeesVO emps) {
		this.emps = emps;
	}

	public JobHistoryVO getJob() {
		return job;
	}

	public void setJob(JobHistoryVO job) {
		this.job = job;
	}

	public LocationsVO getLocation() {
		return location;
	}

	public void setLocation(LocationsVO location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AllJoinVO [depts=" + depts + ", emps=" + emps + ", job=" + job + ", location=" + location
				+  "]";
	}

	public AllJoinVO(DepartmentsVO depts, EmployeesVO emps, JobHistoryVO job, LocationsVO location) {
		super();
		this.depts = depts;
		this.emps = emps;
		this.job = job;
		this.location = location;
	}
	



	
	
	
}
