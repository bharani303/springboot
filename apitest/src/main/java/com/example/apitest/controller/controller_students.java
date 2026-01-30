package com.example.apitest.controller;

import com.example.apitest.model.student;
import com.example.apitest.service.Service_student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class controller_students {
    @Autowired
    Service_student ss;

    @GetMapping("/all")
    public List<student> alll(){
        return ss.allStudents();
    }
    @PostMapping("/add")
    public String add(
            @RequestParam int rollno,
            @RequestParam String name,
            @RequestParam int age,
            @RequestParam String dept
    ) {
        student s = new student(rollno, name, age ,dept);
        ss.add(s);
        return "added... on.... deathnotes..";
    }
    @PutMapping("/update")
    public String addd(@RequestBody student s){
        ss.updated(s);
        return "updated..successfully bro....";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        ss.deleteById(id);
        return "deleted da lava***...";
    }

}
