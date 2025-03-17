package com.example.E_commerce_fullStack_springBoot.repo;

import com.example.E_commerce_fullStack_springBoot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
