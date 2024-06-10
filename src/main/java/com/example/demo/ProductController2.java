package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Products API 2")
@RequestMapping("/v2")
public class ProductController2 {

    @PostMapping("/products")
    public ResponseEntity<Void> createProduct(@RequestBody Product2 product) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(summary = "Get a product by id", description = "Returns a product as per the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Product2.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
    @GetMapping("/products/{id}")
    public ResponseEntity<Product2> getProduct(@PathVariable @Parameter(name = "id", description = "Product id", example = "1") Long id) {
        //retrieval logic
        return ResponseEntity.ok(new Product2(1, "Product 1", "$21.99"));
    }
}
