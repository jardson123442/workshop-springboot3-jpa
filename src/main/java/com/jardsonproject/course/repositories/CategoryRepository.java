package com.jardsonproject.course.repositories;

import com.jardsonproject.course.entities.Category;
import com.jardsonproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
