package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Order;
import com.spring.model.User;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	List<Order> findAllByUserOrderByCreatedDate(User user);

}
