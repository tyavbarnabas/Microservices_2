package com.codeafrica.usermanagement.service;

import com.codeafrica.usermanagement.dto.UserDto;
import com.codeafrica.usermanagement.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(Long id);

    User createUser(UserDto userDto);

    void DeleteUser(Long id);

    void updateUser(Long id, String name, String email, String address);
}
