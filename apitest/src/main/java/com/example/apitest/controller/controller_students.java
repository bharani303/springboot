package com.example.apitest.controller;

import com.example.apitest.model.student;
import com.example.apitest.service.Service_student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
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
        return "added..";
    }
    @PutMapping("/update")
    public String addd(@RequestBody student s){
        ss.updated(s);
        return "updated..";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        ss.deleteById(id);
        return "deleted";
    }

}
