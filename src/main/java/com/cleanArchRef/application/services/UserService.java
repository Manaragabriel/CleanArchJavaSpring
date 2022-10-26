package com.cleanArchRef.application.services;

import com.cleanArchRef.domain.user.entities.User;
import com.cleanArchRef.domain.user.services.IUserService;
import com.cleanArchRef.infrastructure.database.user.models.UserModel;
import com.cleanArchRef.infrastructure.database.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User newUserData){
        UserModel userModel = new UserModel(newUserData.getUserName(), newUserData.getEmail(), newUserData.getPassword(), newUserData.getActive());
        UserModel userSaved =  userRepository.save(userModel);
        newUserData.setId(userSaved.Id);
        return newUserData;
    }
}
