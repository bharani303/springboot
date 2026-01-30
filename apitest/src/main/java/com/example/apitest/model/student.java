package com.example.apitest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Entity
public class student {
    @Id
    private int rollno;
    private String name;
    private int age;
    private String dept;

    public student() {
    }
}