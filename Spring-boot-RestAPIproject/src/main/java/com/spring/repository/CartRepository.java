package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Cart;
import com.spring.model.User;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	List<Cart> deleteByUser(User user);
}
