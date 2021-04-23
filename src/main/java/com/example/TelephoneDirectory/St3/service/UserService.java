package com.example.TelephoneDirectory.St3.service;

import com.example.TelephoneDirectory.St3.entity.User;
import com.example.TelephoneDirectory.St3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public boolean checkuser(User user)
    {
        String id=user.getName();
        Optional<User> user_new = this.userRepository.findById(id);
        System.out.println(user.toString());
        if(user_new.isPresent()){
            User u=user_new.get();
            System.out.println(u.toString());
            if(user.getPassword().equals(u.getPassword()))
                return true;
            else {
                return false;
            }
        }else{
            System.out.println("NO");
            return false;
        }
    }

}
