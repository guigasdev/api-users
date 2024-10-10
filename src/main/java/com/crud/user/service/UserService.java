package com.crud.user.service;

import com.crud.user.repository.UserRepository;
import com.crud.user.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<Users> getUserById(Long id){
        return userRepository.findById(id);
    }

    public Users createUser(Users users){
        return userRepository.save(users);
    }

    public Users updateUser(Long id, Users usersDetails){
        Users users = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        users.setName(usersDetails.getName());
        users.setEmail(usersDetails.getEmail());
        return userRepository.save(users);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
