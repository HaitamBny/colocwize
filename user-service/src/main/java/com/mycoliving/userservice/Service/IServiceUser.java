package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.User;

import java.util.List;

public interface IServiceUser {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
    User findByEmail(String email);
    User addRole(Long userId, Long roleId);
    User removeRole(Long userId, Long roleId);
}
