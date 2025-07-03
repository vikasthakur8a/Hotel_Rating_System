package com.learning.user.service.services;

import com.learning.user.service.entities.User;

import java.util.List;

public interface UserServices {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);

    User updateUser(String id, User userDetails);

    void deleteUser(String id);
}
