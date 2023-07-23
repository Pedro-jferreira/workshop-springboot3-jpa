package com.pedrojferreiradev.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrojferreiradev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
