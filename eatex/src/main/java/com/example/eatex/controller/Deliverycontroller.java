package com.example.eatex.controller;

import com.example.eatex.entity.Delivery;
import com.example.eatex.repository.Deliveryrepository;
import com.example.eatex.repository.Productrepository;
import com.example.eatex.repository.Tyoerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class Deliverycontroller {
    @Autowired

    private Deliveryrepository repository;
    private Tyoerepository doctorRepository;
    private Productrepository nurseRepository;
    @GetMapping("/PatientList")
    public String viewPatient(Model model){
        model.addAttribute("PatientList1", repository.findAll());
        return "PatientList";


    }
    @PostMapping("/addPatient")
    public String addnewPatient(Model model, Delivery patient){

        model.addAttribute("newPatient", new Delivery());

        repository.save(patient);
        return "redirect:/PatientList";
    }


    @GetMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/PatientList" ;

    }

    @GetMapping("/editPatient/{id}")

    public String editPatient(@PathVariable("id") Integer id, Model model){

        model.addAttribute("patient1", repository.findById(id).get());
        model.addAttribute("PatientList1" ,repository.findAll());


        return "editPatient";


    }


}
