package com.springrest;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepo empRepo;

public Employee addEmployee(Employee e) {
	return empRepo.save(e);
}

public List<Employee> getEmployee(){
	return empRepo.findAll();
}

public Employee byId(Integer id) {
	return empRepo.findById(id).orElse(null);
}

public String delById(Integer id) {
	 empRepo.deleteById(id);
	 return "Deleted Successfully";
}
/*public void postImage(MultipartFile file) {
	Employee emp=new Employee();
	String fileName=StringUtils.cleanPath(.getOriginalFilename());
	if(fileName.contains("...")) {
		System.out.println("not a valid file");
	}
	try {
		emp.setImage(Base64.getEncoder().encodeToString(.getBytes()));
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}*/

}
