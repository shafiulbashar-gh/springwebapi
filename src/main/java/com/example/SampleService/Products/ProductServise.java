package com.example.SampleService.Products;

import com.example.SampleService.Models.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServise {
    ProductRepository _dbConnector;

    public ProductServise(ProductRepository dbConnector) {
        _dbConnector = dbConnector;
    }


    public List<Product> GetProducts()
    {
        return _dbConnector.GetProducts();
    }
    public Product CreateProducts(Product product) {
        return _dbConnector.CreateProducts(product);

    }
}
