package com.example.TelephoneDirectory.St3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
    @Id
    public String Username;
    public String Email;
    public String Password;
    public Integer Phoneno;

    public UserInfo() {

    }

    public UserInfo(String username, String email, String password, Integer phoneno) {
        Username = username;
        Email = email;
        Password = password;
        Phoneno = phoneno;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getPhoneno() {
        return Phoneno;
    }

    public void setPhoneno(Integer phoneno) {
        Phoneno = phoneno;
    }
    @Override
    public String toString(){
        return "UserInfo{" +
                "Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Phoneno=" + Phoneno +
                '}';
    }
}