package com.jardsonproject.course.repositories;

import com.jardsonproject.course.entities.Product;
import com.jardsonproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
