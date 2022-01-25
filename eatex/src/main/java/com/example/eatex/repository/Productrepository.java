package com.example.eatex.repository;

import com.example.eatex.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepository extends JpaRepository <Product, Integer> {
}
