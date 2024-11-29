package com.ecommerce.controller;

import org.openqa.selenium.remote.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    // Search products by name
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String name) {
        List<Product> products = productService.searchProducts(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    
 // Search products by category
    @GetMapping("/search/category")
    public ResponseEntity<List<Product>> searchProductsByCategory(@RequestParam String category) {
        List<Product> products = productService.searchProductsByCategory(category);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    
 
    
    // POST endpoint to buy a product by product ID and quantity
    @PostMapping("/buy")
    public ResponseEntity<?> buyProduct(@RequestParam Long id, @RequestParam Integer stockQuantity) {
        try {
            // Call the service method to perform the purchase
            Product purchasedProduct = productService.buyProduct(id, stockQuantity);
            
            // Return the updated product after purchase with a 200 OK status
            return new ResponseEntity<>(purchasedProduct, HttpStatus.OK);
        } catch (RuntimeException e) {
           
            return new ResponseEntity<>("Product with ID " + id + " not found.", HttpStatus.NOT_FOUND);
        }
    }
    
    
}
