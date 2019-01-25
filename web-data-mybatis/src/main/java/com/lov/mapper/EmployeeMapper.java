package com.lov.mapper;

import com.lov.bean.Employee;

public interface EmployeeMapper {

	public Employee getEmpById(Integer id);
	
	public void insertEmp(Employee employee);
}
