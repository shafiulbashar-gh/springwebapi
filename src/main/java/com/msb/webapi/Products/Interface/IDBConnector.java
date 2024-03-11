package com.msb.webapi.Products.Interface;

import com.msb.webapi.Products.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDBConnector extends JpaRepository<Product, Long> {


}
