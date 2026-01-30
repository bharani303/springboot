package com.example.apitest.repostory;

import com.example.apitest.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repostudent extends JpaRepository<student,Integer> {
}
