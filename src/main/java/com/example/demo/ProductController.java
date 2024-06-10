package com.example.demo;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Products API")
@RequestMapping("/v1")
public class ProductController {

    @PostMapping("/products")
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        //retrieval logic
        return ResponseEntity.ok(new Product(1, "Product 1", "$21.99"));
    }
}
