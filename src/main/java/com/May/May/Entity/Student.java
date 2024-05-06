package com.May.May.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Data
@Table(name = "Login_Info")
@NoArgsConstructor
@AllArgsConstructor
public class Student {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

}
