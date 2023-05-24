package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.services.UserService;
import ru.kata.spring.boot_security.dto.UserDto;



import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    private final UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>> showAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping ("/users/{id}")
    public  ResponseEntity<User> getUser(@PathVariable("id")Long id) {
        User user = userService.findById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @PostMapping("/users")
    public  ResponseEntity<HttpStatus> newUser(@RequestBody UserDto userDto) {
        userService.saveUser(userService.convertToUser(userDto));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PatchMapping(value = "/users/{id}")
    public ResponseEntity<HttpStatus> updateUser(@RequestBody User user,@PathVariable("id") Long id) {
        userService.updateUser(id,user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}