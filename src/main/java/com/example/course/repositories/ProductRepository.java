package com.example.course.repositories;

import com.example.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
