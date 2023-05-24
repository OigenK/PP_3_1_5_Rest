package ru.kata.spring.boot_security.dto;


import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Collection;

public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String username;
    private String password;
    private Collection<Role> roles;

    public UserDto() {
    }

    public UserDto(long id, String username, String name, String lastName, String password, int age, Collection<Role> roles) {
        this.id = id;
        this.username = username;
        this.firstName = name;
        this.lastName = lastName;
        this.password = password;
        this.age = age;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

}
