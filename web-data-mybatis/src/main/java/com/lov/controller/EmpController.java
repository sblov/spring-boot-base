package com.lov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lov.bean.Employee;
import com.lov.mapper.EmployeeMapper;

@RestController
public class EmpController {

	@Autowired
	EmployeeMapper employeeMapper;
	
	@GetMapping("/emp/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		return employeeMapper.getEmpById(id);
	}
	

}
