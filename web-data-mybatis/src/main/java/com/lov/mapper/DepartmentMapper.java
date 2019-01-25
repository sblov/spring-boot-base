package com.lov.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lov.bean.Department;

//@Mapper
public interface DepartmentMapper {

	
	@Select("select * from department where id=#{id}")
	public Department getDeptById(Integer id);
	
	@Delete("delete from department where id=#{id}")
	public int deleteDeptById(Integer id);
	
	@Options(useGeneratedKeys=true,keyProperty="id")
	@Insert("insert into department(department_name) value(#{departmentName})")
	public int insertDept(Department department);
	
	@Update("update department set department_name=#{departmentName} where id=#{id}")
	public int updateDept(Department department);
	
}
