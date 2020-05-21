package com.lowes.assessment.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowes.assessment.model.Employee;
import com.lowes.assessment.repository.EmployeeRepository;

@Service
public class DefaultEmployeeService implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public Employee getById(Serializable id) {
		// return employeeRepository.getById((Long) id);
		Optional<Employee> employee = employeeRepository.findById((Long) id);
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void delete(Serializable id) {
		employeeRepository.deleteById((Long) id);
	}
}
