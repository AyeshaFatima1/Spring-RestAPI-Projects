package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Counter;
import com.spring.repository.CounterRepo;

@Service
public class CounterService {

	@Autowired
	public CounterRepo counRepo;
	
	public List<Counter> getCounters() {
		return counRepo.findAll();
	}

	public Counter addCounter(Counter c) {
		return counRepo.save(c);
	}

	public Counter getCounter(Integer id) {
		return counRepo.findById(id).orElseThrow(null);
	}

	public Counter updateCounter(Counter c) {
		return counRepo.save(c);
	}

	public void deleteCounter(Integer id) {
		counRepo.deleteById(id);;
	}

}
