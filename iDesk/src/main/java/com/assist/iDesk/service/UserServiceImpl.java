package com.assist.iDesk.service;

import com.assist.iDesk.entity.User;
import com.assist.iDesk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Setter
@Transactional
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getUsers() {
        return userRepository.findAll() ;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email);
    }

    private String isValidUpdate(User user) {
        String response = "";
        Optional<User> optUser = Optional.ofNullable(user);
        if (optUser.isPresent()) {
            if (user.getFirstName() != null && (user.getFirstName().length() < 5 || user.getFirstName().length() > 20))
                response += "The first name length should be between 5 and 20 characters.\n";
            if (user.getLastName() != null && (user.getLastName().length() < 5 || user.getLastName().length() > 20))
                response += "The last name length should be between 5 and 20 characters.\n";
            if (user.getEmail() != null && (user.getEmail().length() < 5 || user.getEmail().length() > 40 || !user.getEmail().contains("@") || !user.getEmail().contains(".") || (userRepository.findByEmail(user.getEmail()) != null) && userRepository.countByEmail(user.getEmail()) > 1))
                response += "Invalid/duplicate email. (must contain '@', '.' and has a length between 5 and 40 characters.\n";
            if (userRepository.findByRole(Long.valueOf(user.getRole())) == null)
                response += "There is no role <" + user.getRole() + "> available.\n";
            if (user.getGender() != null && (user.getGender().contains("Male")  || user.getGender().contains("Female")|| user.getGender().contains("Other")))
                response += "The gender should be Male,Female or Other.\n";
        }
        return response;
    }

    public UserDetails getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public ResponseEntity getUserById(Long id) {
        if (userRepository.findById(id).orElse(null) != null)
            return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
        else
            return new ResponseEntity<>("There is no registred user with id <" + id + ">.", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity updateUser(User user, Long id) {
        User existingUser = userRepository.findById(id).orElse(null);
        String response = isValidUpdate(user);
        if (existingUser != null) {
            if (response == null || response.equals("")) {
                existingUser.setFirstName(user.getFirstName());
                existingUser.setLastName(user.getLastName());
                existingUser.setEmail(user.getEmail());
                existingUser.setPassword(user.getPassword());
                existingUser.setRole(user.getRole());
                existingUser.setGender(user.getGender());
                existingUser.setNationality(user.getNationality());
                existingUser.setDateOfBirth(user.getDateOfBirth());
                userRepository.save(existingUser);
                return new ResponseEntity<>("User with id <" + id + "> has been updated.", HttpStatus.OK);
            }
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Can't find user with id <" + id + ">.", HttpStatus.BAD_REQUEST);

    }
    /*
    public ResponseEntity deactivateUser(Long id){
        if (userRepository.existsById(id)==true) {
            userRepository.deactived(false);
            return new ResponseEntity<>("User with id <" + id + "> has been deactivate.", HttpStatus.OK);
        }
        return new ResponseEntity<>("Can't find user with id <" + id + ">.", HttpStatus.BAD_REQUEST);

    }*/
}
