package com.example.eatex.repository;

import com.example.eatex.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface Deliveryrepository extends JpaRepository<Delivery, Integer> {
    }


