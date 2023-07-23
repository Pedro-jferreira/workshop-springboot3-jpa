package com.pedrojferreiradev.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrojferreiradev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
