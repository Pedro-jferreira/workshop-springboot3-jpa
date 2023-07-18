package com.pedrojferreiradev.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrojferreiradev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
