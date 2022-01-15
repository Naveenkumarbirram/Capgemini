 package org.postgresql.controller;

import java.util.*;

import org.postgresql.exception.ResourceNotFoundException;
import org.postgresql.model.Employee;
import org.postgresql.repository.Employee_Repository;
import org.postgresql.repository.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Employee_Controller {
	
	//Call my http methods 
	
	@Autowired
	private Employee_Repository employeeRepository;
	
	//get employee information - Id, first_name,last_name and email
	@GetMapping("employees")
	public List<Employee>getEmployee(){
		return this.employeeRepository.findAll();
	}
	
	//get employee information with the help of Id	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById
			(@PathVariable(value = "id")Integer employeeId)
	throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> 
		new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}	
	//Save employee
	@PostMapping("employees")
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}
		
	//Update the employee information
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById
			(@PathVariable(value = "id")Integer employeeId, 
					@Validated @RequestBody Employee employeeDetails)
	throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> 
		new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		
		employee.setEmail(employeeDetails.getEmail());
		employee.setFirst_name(employeeDetails.getFirst_name());
		employee.setLast_name(employeeDetails.getLast_name());
		
		return ResponseEntity.ok(this.employeeRepository.save(employee));	
		}	
	//delete the employee information
	@DeleteMapping("employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value="id")Integer employeeId)
	throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(( ) -> new ResourceNotFoundException
						("Employee is not found by that id :: "+ employeeId));
		this.employeeRepository.delete(employee);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}