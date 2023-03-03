package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.student;

public interface StudentRepo extends JpaRepository<student,Integer> {
    
}