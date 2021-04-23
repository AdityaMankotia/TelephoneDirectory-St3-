package com.example.TelephoneDirectory.St3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    @JsonProperty
    @Id
    @Column(name = "name",unique = true)
    private String name;
    @JsonProperty
    @Column(name = "password")
    private String password;

    public User() {

    }
    public User(String uname,String pword)
    {
        name=uname;
        password=pword;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
