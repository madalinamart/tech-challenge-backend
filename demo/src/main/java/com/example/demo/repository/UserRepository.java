package com.example.demo.repository;

import com.example.demo.entity.User;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsById(int id);

    User findByEmail(String email);

    int countById(int id);

    int countByEmail(String email);

}
