package com.example.Ecommerce.Repository;

import com.yourcompany.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom database queries if needed
}
