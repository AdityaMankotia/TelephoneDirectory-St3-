package com.example.TelephoneDirectory.St3.repository;

import com.example.TelephoneDirectory.St3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
