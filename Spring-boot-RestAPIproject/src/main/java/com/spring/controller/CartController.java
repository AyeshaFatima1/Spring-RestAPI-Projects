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

import com.spring.model.Cart;
import com.spring.model.User;
import com.spring.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	public CartService cartService;

	@GetMapping("/")
	public List<Cart> getCarts(){
		return this.cartService.getCarts();
	}

	@PostMapping("/addCart")
	public Cart addCart(@RequestBody Cart cart) {
		return this.cartService.addToCart(cart);
	}

	@GetMapping("/Cart/{id}")
	public Cart getCart(@PathVariable Integer id) {
		return this.cartService.getCart(id);
	}
	
	@PutMapping("/updateCart")
	public Cart updateCart(@RequestBody Cart cart) {
		return this.cartService.updateCart(cart);
	}

	@DeleteMapping("/deleteCart/{id}")
	public void deleteCart(@PathVariable Integer id) {
		cartService.deleteCart(id);
	}
	
	@DeleteMapping("/items")
	public void deleteCartItems(@PathVariable Integer id) {
		cartService.deleteCartItems(id);
	}
	
	@DeleteMapping("/userItem")
	public void deleteUserCartItems(@PathVariable User user) {
		cartService.deleteUserCartItems(user);
	}
}
