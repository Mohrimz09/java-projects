package com.May.May.Repo;

import com.May.May.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student,Integer> {
}
