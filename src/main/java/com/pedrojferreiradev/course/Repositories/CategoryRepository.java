package com.pedrojferreiradev.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrojferreiradev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
