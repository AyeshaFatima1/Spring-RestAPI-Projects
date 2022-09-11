package com.springrest;

import java.util.List;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class EmployeeController {

@Autowired
private EmployeeService es;

@GetMapping("/home")
public String home() {
	return "Welcome to RestAPI";
}
@PostMapping("/addemployee")
public Employee addEmployee(@RequestBody Employee e) {
	return this.es.addEmployee(e);
}
@GetMapping("/employeelist")
public List<Employee> getEmployee(){
	return this.es.getEmployee();
}
@GetMapping("/employee/{id}")
public Employee byId(@PathVariable Integer id) {
	return this.es.byId(id);
}
@DeleteMapping("/delete/{id}")
public String delById(@PathVariable Integer id) {
	 this.es.delById(id);
	 return "Deleted Successfully";
}
/*@PostMapping("/postimage")
public Employee postImage(@RequestParam MultipartFile file) {
	return this.es.postImage(file.getBytes());
}*/
}
