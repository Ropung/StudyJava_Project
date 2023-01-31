//6
package com.kdigital.user_info.vo;

import java.io.Serializable;

public class UserInfo implements Serializable, Cloneable {
	// 사원번호(employee_id), 이름(first_name), 연봉(salary), 부서번호(department_id), 부서명(department_name),  도시(city)
	private Long employeeId;
	private String firstName;
	private double salary;
	private Long departmentId;
	private String departmentName;
	private String city;
	
	public UserInfo() {}
	
	public UserInfo(Long employeeId, String firstName, double salary, Long departmentId, String departmentName,
			String city) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.city = city;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserInfo{employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary
				+ ", departmentId=" + departmentId + ", departmentName=" + departmentName + ", city=" + city + "}";
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// ...
//	}
}
