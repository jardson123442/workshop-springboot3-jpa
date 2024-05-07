package com.jardsonproject.course.repositories;

import com.jardsonproject.course.entities.OrderItem;
import com.jardsonproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
