package com.example.product.ecommerce.Controller;
import com.example.product.ecommerce.DTO.ProductDTO;
import com.example.product.ecommerce.Model.Product;
import com.example.product.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//This class will handle all api's related to the product


@RestController
@RequestMapping("/products")
public class ProductController {



    @Autowired
    ProductService productService;


    @GetMapping
    public ResponseEntity<List<Product>> GetProducts(){
        ResponseEntity<List<Product>> responseEntity=new ResponseEntity<>(
                productService.getAllProduct(),
                HttpStatus.OK
        );
        return responseEntity;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> GetProductById(@PathVariable("id") int id){
        return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ProductDTO> AddProduct(@RequestBody ProductDTO product){
        return new ResponseEntity<ProductDTO>(
                productService.createProduct(product),
                HttpStatus.CREATED
        );
    }





}
