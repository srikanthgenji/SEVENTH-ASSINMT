package com.myfirstpackage.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myfirstpackage.entity.Order;

public interface  OrderReposistry extends JpaRepository<Order, Integer> {
	

}
