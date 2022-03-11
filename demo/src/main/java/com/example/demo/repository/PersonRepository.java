package com.example.demo.repository;
import java.util.List;
import com.example.demo.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
@Repository

public interface PersonRepository extends JpaRepository <Person,Long> {
    List<Person> findAll();
Person findByName(String name);

}
