package com.papaskripto.studentportal.service;

import com.papaskripto.studentportal.data.entity.Role;
import com.papaskripto.studentportal.data.entity.UserEntity;
import com.papaskripto.studentportal.data.repository.UserRepository;
import com.papaskripto.studentportal.web.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listAllUsers () {
        List<UserEntity> userEntities = this.userRepository.findAll();
        List<User> users = new ArrayList<>(userEntities.size());
        userEntities.forEach(user -> users.add (new User(user.getUserId(), user.getUsername(), user.getPassword(), user.getRole().toString())));
        return users;
    }

    public User getUserById (UUID id) {
        Optional<UserEntity> userEntity = this.userRepository.findById(id);
        return userEntity.map(this::getUserFromEntity).orElse(null);
    }

    public User addUser (User user) {
        UserEntity userEntity = this.getUserEntityFromUser(user);
        userEntity = this.userRepository.save(userEntity);
        return this.getUserFromEntity(userEntity);
    }

    public void deleteUser (UUID id) {
        this.userRepository.deleteById(id);
    }

    private User getUserFromEntity (UserEntity userEntity) {
        return new User(userEntity.getUserId(), userEntity.getUsername(), userEntity.getPassword(), userEntity.getRole().toString());
    }

    private UserEntity getUserEntityFromUser (User user) {
        return new UserEntity(user.getUserId(), user.getUsername(), user.getPassword(), Role.valueOf(user.getRole()));
    }
}
