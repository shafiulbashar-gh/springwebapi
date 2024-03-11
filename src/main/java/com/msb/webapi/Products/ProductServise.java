package com.msb.webapi.Products;

import com.msb.webapi.Products.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServise {
    ProductRepository productRepository;

    public ProductServise(ProductRepository dbConnector) {
        productRepository = dbConnector;
    }


    public List<Product> GetProducts()
    {
        return productRepository.GetProducts();
    }
    public Product CreateProducts(Product product) {
        return productRepository.CreateProducts(product);

    }
}
