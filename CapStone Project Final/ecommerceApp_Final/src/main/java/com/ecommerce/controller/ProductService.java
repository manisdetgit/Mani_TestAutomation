package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	// Search products by name
	public List<Product> searchProducts(String name) {
		return productRepository.findByNameContaining(name);
	}

	// Search products by category
	public List<Product> searchProductsByCategory(String category) {
		return productRepository.findByCategoryContaining(category);
	}

	// buy products using Id and StockQuantity
	public Product buyProduct(Long productId, int stockQuantity) {
		Product product = productRepository.findById(productId)
				.orElseThrow(() -> new RuntimeException("Product not found..."));
		if (product.getStockQuantity() > 0) {
			product.setStockQuantity(product.getStockQuantity() - stockQuantity); // Decrease stock
			productRepository.save(product); // Save updated product
			return product;
		} else {
			throw new RuntimeException("Product out of stock");
		}
	}
}
