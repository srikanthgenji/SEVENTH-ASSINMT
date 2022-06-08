package com.myfirstpackage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstpackage.entity.Order;
import com.myfirstpackage.service.OrderService;

@RestController

public class OrderController {
	@Autowired
	OrderService orderService;

	@GetMapping("/{id}")
	ResponseEntity<Optional<Order>> getOrder(@PathVariable int id) {
	Optional<Order> order = orderService.getOrderById(id);
	if (order.isPresent()) {
	return ResponseEntity.ok(order);
	} else {
	return ResponseEntity.notFound().build();
	}

}
}
