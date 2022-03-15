package com.example.demo.user;

import com.example.demo.desk.Desk;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Userss")

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

