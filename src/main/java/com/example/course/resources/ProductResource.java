package com.example.course.resources;

import com.example.course.entities.Product;
import com.example.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = service.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product p = service.findById(id);
        return ResponseEntity.ok().body(p);
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Product> insert(@RequestBody Product product) {
        service.insert(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Product> removeById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
