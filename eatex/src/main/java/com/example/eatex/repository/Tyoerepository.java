package com.example.eatex.repository;

import com.example.eatex.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tyoerepository extends JpaRepository <Type, Integer> {
}
