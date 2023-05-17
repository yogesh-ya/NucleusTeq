package com.crud.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.main.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
