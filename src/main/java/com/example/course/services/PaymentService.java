package com.example.course.services;

import com.example.course.entities.Payment;
import com.example.course.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public List<Payment> findAll() {
        return repository.findAll();
    }

    public Payment findById(Long id) {
        return repository.findById(id).get();
    }

}
