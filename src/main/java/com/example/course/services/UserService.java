package com.example.course.services;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;
import com.example.course.services.exceptions.DatabaseException;
import com.example.course.services.exceptions.ObjectNotFoundException;
import com.example.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public void insert(User user) {
        userRepository.save(user);
    }

    public void deleteById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User user) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        User u = userRepository.getReferenceById(id);
        updateData(u, user);
        return userRepository.save(u);
    }

    private void updateData(User u, User user) {
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setPhone(user.getPhone());
    }
}
