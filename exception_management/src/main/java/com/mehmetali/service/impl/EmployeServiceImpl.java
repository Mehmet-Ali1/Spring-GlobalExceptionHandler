package com.mehmetali.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mehmetali.dto.DtoDepartment;
import com.mehmetali.dto.DtoEmployee;
import com.mehmetali.exception.BaseException;
import com.mehmetali.exception.ErrorMessage;
import com.mehmetali.exception.MessageType;
import com.mehmetali.model.Department;
import com.mehmetali.model.Employee;
import com.mehmetali.repository.EmployeeRepository;
import com.mehmetali.service.IEmployeeService;

@Service
public class EmployeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee=new DtoEmployee();
		DtoDepartment dtoDepartment=new DtoDepartment();
		Optional<Employee>optional= employeeRepository.findById(id);
		if(optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
		}
		Employee employee=optional.get();
		Department department=employee.getDepartment();
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		return dtoEmployee;
	}

}
