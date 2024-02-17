package com.example.Ecommerce.ProductController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String listProducts() {
        // Implement logic to return list of products
        return "List of Products";
    }
}
