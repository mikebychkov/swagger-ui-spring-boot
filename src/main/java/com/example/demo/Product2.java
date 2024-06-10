package com.example.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product2 {

    @Schema(name = "Product ID", example = "1", required = true)
    private long id;

    @Schema(name = "Product name", example = "Product 1", required = false)
    private String name;

    @Schema(name = "Product price", example = "$100.00", required = true)
    private String price;
}
