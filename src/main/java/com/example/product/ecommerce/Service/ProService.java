package com.example.product.ecommerce.Service;

import com.example.product.ecommerce.DTO.ProductDTO;
import com.example.product.ecommerce.Model.Product;

import java.util.List;

public interface ProService {
    public List<Product> getAllProduct();
    public Product getProductById(int id);
    public ProductDTO createProduct(ProductDTO product);
}
