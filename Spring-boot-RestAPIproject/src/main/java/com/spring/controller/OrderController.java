package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Order;
import com.spring.model.User;
import com.spring.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	public OrderService orderService;

	@GetMapping("/")
	public List<Order> getOrders(){
		return this.orderService.getOrders();
	}

	@PostMapping("/add")
	public Order addOrder(@RequestBody Order order) {
		return this.orderService.addOrder(order);
	}

	@GetMapping("/order/{id}")
	public Order getOrder(@PathVariable Integer id) {
		return this.orderService.getOrder(id);
	}

	@GetMapping("/orderByCreatedDate")
	public List<Order> listOrders(@PathVariable User user) {
		return this.orderService.listOrders(user);
	}
	
	@PutMapping("/updateOrder")
	public Order updateOrder(@RequestBody Order order) {
		return this.orderService.updateOrder(order);
	}

	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable Integer id) {
		orderService.deleteOrder(id);
	}
}
