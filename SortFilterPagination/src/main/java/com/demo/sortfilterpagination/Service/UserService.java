package com.demo.sortfilterpagination.Service;

import com.demo.sortfilterpagination.Model.User;
import com.demo.sortfilterpagination.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public Page<User> getUsers(int age, String city, Pageable pageable) {
        return userRepo.findByAgeLessThanAndCity(age,city,pageable);
    }
}
