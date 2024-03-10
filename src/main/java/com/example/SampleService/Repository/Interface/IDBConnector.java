package com.example.SampleService.Repository.Interface;

import com.example.SampleService.Config.ApplicationConfigurations;
import com.example.SampleService.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDBConnector extends JpaRepository<Product, Long> {


}
