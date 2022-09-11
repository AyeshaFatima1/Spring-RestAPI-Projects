package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Counter;

@Repository
public interface CounterRepo extends JpaRepository<Counter, Integer> {
	public Counter findById(int id);

}
