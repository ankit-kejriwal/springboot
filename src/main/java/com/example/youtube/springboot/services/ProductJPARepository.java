package com.example.youtube.springboot.services;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.youtube.springboot.entities.Product;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {


}
