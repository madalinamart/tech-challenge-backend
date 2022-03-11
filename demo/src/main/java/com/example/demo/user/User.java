package com.example.demo.user;

import com.example.demo.person.Person;
import com.example.demo.desk.Desk;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class User extends Person {
    @Id
    private Long id;
    private String email;
    private String password;
    private String role;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "id_desk_id")
    private Desk IdDesk;

    public Desk getIdDesk() {
        return IdDesk;
    }

    public User() {
    }

    public User(Long id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String nationality, Long id1, String email, String password, String role, boolean status, Desk idDesk) {
        super(id, firstName, lastName, dateOfBirth, gender, nationality);
        this.id = id1;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
        IdDesk = idDesk;
    }
    @Id
    @Column(name = "ID")
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    @Basic
    @Column(name = "E-mailAdress",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Basic
    @Column(name = "Password",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Basic
    @Column(name = "Role",nullable = false)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Basic
    @Column(name = "Status",nullable = false)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return status == user.status && Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(role, user.role) && Objects.equals(IdDesk, user.IdDesk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, role, status, IdDesk);
    }
}
