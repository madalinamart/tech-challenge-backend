package com.assist.iDesk.repository;

import com.assist.iDesk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Long> {
    UserDetails findByEmail(String email);

    @Query("SELECT role FROM User where role is not null")
    User findByRole(Long id);

    int countByEmail(String email);
    boolean existsById(Long id);
   // boolean deactived(Boolean status);




}
