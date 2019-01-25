package com.lov.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.lov.dao.DepartmentDao;
import com.lov.dao.EmployeeDao;
import com.lov.entities.Department;
import com.lov.entities.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	DepartmentDao departmentDao;
	
//	跳转列表
	@GetMapping("/emps")
	public String list(Model model) {
		
		Collection<Employee> employees = employeeDao.getAll();
		
		model.addAttribute("emps", employees);
		
		return "emp/list";
	}
//	跳转添加页面
	@GetMapping("/emp")
	public String toAddPage(Model model) {
		
		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts", departments);
		return "emp/add";
	}
	
//	添加请求
	@PostMapping("/emp")
	public String addEmp(Employee employee) {
		
		System.out.println(employee);
		
		employeeDao.save(employee);
//		内部通过thymleafViewResolver进行解析，以重定向方式
		return "redirect:/emps";
	}
	
//	修改页面
	@GetMapping("/emp/{id}")
	public String toEditPage(@PathVariable("id") Integer id,Model model) {
		
		Employee employee = employeeDao.get(id);
		model.addAttribute("emp", employee);
		
		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts", departments);
		
		return "emp/add";
		
	}
	
//	修改请求
	
	 @PutMapping("/emp") 
	 public String updateEmployee(Employee employee) {
	 
		 employeeDao.save(employee); 
		 return "redirect:/emps"; 
	 }
//	 删除
	 @DeleteMapping("/emp/{id}")
	 public String deleteEmployee(@PathVariable("id") Integer id) {
		 employeeDao.delete(id);
		 return "redirect:/emps";
	 }
	
}
