package com.example.demo.entity;

import com.example.demo.entity.Desk;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Users")

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;


    @Basic
    @Column(name = "EmailAddress")
    private String email;


    @Basic
    @Column(name = "Password")
    private String password;

    @Basic
    @Column(name = "Role")
    private String role;

    @Basic
    @Column(name = "Status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "IdDesk")
    private Desk idDesk;






}

