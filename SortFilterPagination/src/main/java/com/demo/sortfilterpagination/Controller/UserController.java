package com.demo.sortfilterpagination.Controller;

import com.demo.sortfilterpagination.Model.User;
import com.demo.sortfilterpagination.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/v1/users")
    public ResponseEntity<Page<User>> getUsers(
            @RequestParam int age,
            @RequestParam String city,
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sortBy
    ){

        String[] sortParam=sortBy.split(",");
        Sort sort=Sort.by(Sort.Direction.fromString(sortParam[1]),sortParam[0]);
        Pageable pageable= PageRequest.of(page,size,sort);

        Page<User> response=userService.getUsers(age,city,pageable);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
