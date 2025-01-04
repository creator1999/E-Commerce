package com.example.product.ecommerce.Service;

import com.example.product.ecommerce.DTO.ProductDTO;
import com.example.product.ecommerce.Model.Category;
import com.example.product.ecommerce.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements ProService {


    @Autowired
    RestTemplate restTemplate;


    public List<Product> getAllProduct(){
        ProductDTO[] products= restTemplate.
                getForObject("https://fakestoreapi.com/products",
                        ProductDTO[].class);
        List<Product> productList= new ArrayList<>();

        for (ProductDTO productDTO : products) {
            productList.add(convertProductDTOToProduct(productDTO));
        }

        return productList;
    }


    public Product getProductById(int id) {
        ProductDTO productDTO=restTemplate.
                getForObject("https://fakestoreapi.com/products/"+id,ProductDTO.class);
        return convertProductDTOToProduct(productDTO);
    }

    @Override
    public ProductDTO createProduct(ProductDTO product) {
        restTemplate.postForObject("https://fakestoreapi.com/products",product,ProductDTO.class);
        return product;

    }


    public Product convertProductDTOToProduct(ProductDTO productDTO){
        Product product = new Product(
                productDTO.getId(), productDTO.getTitle(), productDTO.getPrice(),
                new Category(productDTO.getCategory())
        );
        return product;

    }


}
