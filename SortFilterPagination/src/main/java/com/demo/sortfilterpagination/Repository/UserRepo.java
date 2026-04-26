package com.demo.sortfilterpagination.Repository;

import com.demo.sortfilterpagination.Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    Page<User> findByAgeLessThanAndCity(int age, String city, Pageable pageable);
}
