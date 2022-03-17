package com.assist.iDesk.entity;


import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class User  implements UserDetails  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Basic
    @Column(name = "FirstName")
    private String firstName;

    @Basic
    @Column(name = "LastName")
    private String lastName;

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
    @Column(name = "Gender")
    private String gender;

    @Basic
    @Column(name = "Nationality")
    private String nationality;

    @Basic
    @Column(name = "DateBirth")
    private LocalDate dateOfBirth;

    @Basic
    @Column(name = "Status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "IdDesk")
    private Desk idDesk;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority= new SimpleGrantedAuthority(role);
        return Collections.singletonList(authority);
    }


    @Override
    public String getUsername() {
        return email;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return status;
    }

    @Override
    public boolean isAccountNonLocked() {
        return status;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return status;
    }

    @Override
    public boolean isEnabled() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

