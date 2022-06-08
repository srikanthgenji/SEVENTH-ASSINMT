package com.myfirstpackage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfirstpackage.entity.Order;
import com.myfirstpackage.reposistry.OrderReposistry;

@Service
public class OrderService {
	@Autowired
	OrderReposistry orderReposistry;

	public Optional<Order> getOrderById(int id) {
	return orderReposistry.findById(id);
	}

}
