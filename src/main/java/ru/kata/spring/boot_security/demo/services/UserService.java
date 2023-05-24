package ru.kata.spring.boot_security.demo.services;


import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(long id, User user);

    Optional<User> findByUsername(String username);

    User findById(long id);

    User convertToUser(UserDto userDto);

    List<User> getAllUsers();


}
