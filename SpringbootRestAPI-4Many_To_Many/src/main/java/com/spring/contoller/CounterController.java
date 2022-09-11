package com.spring.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Counter;
import com.spring.service.CounterService;

@RestController
public class CounterController {

@Autowired
public CounterService counterService;

@GetMapping("/counterlist")
public List<Counter> getCounters(){
	return counterService.getCounters();
}

@PostMapping("/addcounter")
public Counter addCounter(@RequestBody Counter c) {
	return counterService.addCounter(c);
}

@GetMapping("/counter/{id}")
public Counter getCounter(@PathVariable Integer id) {
	return counterService.getCounter(id);
}

@PutMapping("/updatecounter/{id}")
public Counter updateCounter(@RequestBody Counter c) {
	return counterService.updateCounter(c);
}

@DeleteMapping("/deletecounter/{id}")
public void deleteCounter(@PathVariable Integer id) {
	counterService.deleteCounter(id);
}
}
