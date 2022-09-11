package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Cart;
import com.spring.model.User;
import com.spring.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	public CartRepository cartRepository;
	
	public List<Cart> getCarts() {
		return cartRepository.findAll();
	}

	public Cart addToCart(Cart cart) {
		return cartRepository.save(cart);
	}

	public Cart getCart(Integer id) {
		return cartRepository.findById(id).orElseThrow(null);
	}
		
	public Cart updateCart(Cart cart) {
		return cartRepository.save(cart);
	}

	public void deleteCart(Integer id) {
		cartRepository.deleteById(id);;
	}
	
	 public void deleteCartItems(Integer userId) {
	    cartRepository.deleteAll();
    }

	 public void deleteUserCartItems(User user) {
	    cartRepository.deleteByUser(user);
	}

}
