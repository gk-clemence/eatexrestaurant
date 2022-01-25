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
public class Delivery {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer clientId;
        @Column(nullable = false, length = 40)
        String clientName;
        String gender;
        @ManyToOne
        @JoinColumn(name = "product_product_id")
        Product product;
        @ManyToOne
        @JoinColumn(name = "type_typeid")
        Type type;


    }

