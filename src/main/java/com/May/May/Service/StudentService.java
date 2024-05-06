package com.May.May.Service;


import com.May.May.Entity.Student;
import com.May.May.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;



    public Student saveDetails(Student student)
    {
        return studentRepo.save(student);
    }



}
