package com.example.eatex.controller;

import com.example.eatex.repository.Deliveryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class Appcontroller
{
    @Autowired
    public Deliveryrepository repository;

        public String showIndex(Model model){
            model.addAttribute("Patient", new com.example.eatex.entity.Delivery());
            model.addAttribute("DoctorList1", repository.findAll());
            return "index";
        }

    }


