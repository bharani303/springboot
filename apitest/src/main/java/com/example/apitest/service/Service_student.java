package com.example.apitest.service;

import com.example.apitest.model.student;
import com.example.apitest.repostory.repostudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service_student {

    @Autowired
repostudent list;
    public List<student> allStudents() {
        return list.findAll();
    }

    public void add(student s) {
        list.save(s);
    }


    public void updated(student s) {

        list.save(s);
    }

    public void delete(student s) {
        list.delete(s);
    }

    public void deleteById(int id) {
        list.deleteById(id);
    }
}
