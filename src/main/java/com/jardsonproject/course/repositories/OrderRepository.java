package com.jardsonproject.course.repositories;

import com.jardsonproject.course.entities.Order;
import com.jardsonproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
