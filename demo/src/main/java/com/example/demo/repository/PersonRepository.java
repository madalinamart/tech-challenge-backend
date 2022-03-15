package com.example.demo.repository;
import java.util.List;
import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonRepository extends JpaRepository <Person,Long> {
    List<Person> findAll();
Person findByName(String name);

}
