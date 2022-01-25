package com.example.eatex.controller;

import com.example.eatex.entity.Type;
import com.example.eatex.repository.Tyoerepository;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Typecontroller {


        @Autowired
        private Tyoerepository repository;
        @GetMapping("/NurseList")
        public String viewPatient(Model model){
            model.addAttribute("NurseList1", repository.findAll());
            return "NurseList";


        }

        @PostMapping("/addNurse")

        public String addnewNurse(Model model, Type type){
            model.addAttribute("newNurse", new Type());
            repository.save(type);
            return "redirect:/NurseList";

        }

        @GetMapping("/" +
                "/{id}")
        public String deleteNurse(@PathVariable("id") Integer id){
            repository.deleteById(id);
            return"redirect:/NurseList" ;

        }



        @GetMapping("/editNurse/{id}")

        public String editPatient(@PathVariable("id") Integer id, Model model){

            model.addAttribute("nurse", repository.findById(id).get());
            model.addAttribute("NurseList" ,repository.findAll());

            return "editNurse";


        }

    }

