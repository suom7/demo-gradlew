package com.example.demogradle.controller;

import com.example.demogradle.domain.Product;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/1.0/product")
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new Product(1L, "Product A"));
    }

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> create(@RequestBody Product domain) {
        return ResponseEntity.ok(domain);
    }

    @PostMapping(value = "update/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product domain) {
        return ResponseEntity.ok(domain);
    }

    @GetMapping("")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> items = Arrays.asList(new Product(1L, "ProductA"), new Product(2L, "ProductB"));
        return ResponseEntity.ok(items);
    }
}
