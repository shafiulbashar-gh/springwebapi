package com.example.SampleService.Products;

import com.example.SampleService.Models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductServise _apiService;
    @GetMapping("/get-product")
    public List<Product> GetProduct() {

        return _apiService.GetProducts();
    }

    @PostMapping("/create-product")
    public ResponseEntity<Product> Creatproduct(@RequestBody Product product) {
        try {
            Product pro = _apiService.CreateProducts(product);
            return new ResponseEntity<>(pro, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
