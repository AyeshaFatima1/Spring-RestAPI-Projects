package com.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

@Autowired
private StudentRepository studentRepository;

StudentController(StudentRepository studentRepository){
	this.studentRepository=studentRepository;
}

@PostMapping("/addstudent")
public Student addstudent(@RequestBody Student s) {
	return studentRepository.save(s);
}

@GetMapping("/studentlist")
public Iterable<Student> findAllUsers(){
	return studentRepository.findAll();
}

@GetMapping("/student/{id}")
public Student one(@PathVariable Integer id) {
	return studentRepository.findById(id).orElseThrow(null);
}
@DeleteMapping("/delete/{id}")
public void del(@PathVariable Integer id) {
    studentRepository.deleteById(id);
}
@PutMapping("/update/{id}")
public Student replace(@RequestBody Student s) {
	return studentRepository.save(s);
} 
}
