package com.example.course.repositories;

import com.example.course.entities.OrderItem;
import com.example.course.entities.User;
import com.example.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
