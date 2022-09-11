package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Order;
import com.spring.model.User;
import com.spring.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepository;

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}

	public Order getOrder(Integer id) {
		return orderRepository.findById(id).orElseThrow(null);
	}
	
	public List<Order> listOrders(User user) {
        return orderRepository.findAllByUserOrderByCreatedDate(user);
    }
	
	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);;
	}

}
