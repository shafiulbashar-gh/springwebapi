package com.example.SampleService.Products;

import com.example.SampleService.Models.Product;
import com.example.SampleService.Repository.Interface.IDBConnector;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductRepository {
    IDBConnector _dbConnector;

    public ProductRepository(IDBConnector dbConnector) {
        _dbConnector = dbConnector;
    }

    public List<Product> GetProducts() {
        return _dbConnector.findAll();
    }

    public Product CreateProducts(Product product) {
        Product pro = _dbConnector.save(product);

        return pro;
    }
}
