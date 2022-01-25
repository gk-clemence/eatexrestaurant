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
public class Type {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer typeid;
        @Column(nullable = false, length = 40)
        String type;

    }


