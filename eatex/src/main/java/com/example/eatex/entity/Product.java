package com.example.eatex.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer productId;
        @Column(nullable = false, length = 40)
        String productName;

    }


