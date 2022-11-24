package com.cleanArchRef.application.useCases.createUser;

import com.cleanArchRef.domain.user.entities.User;

public class InputCreateUserDTO {

    public InputCreateUserDTO(String userName, String email, String password) {
        UserName = userName;
        Email = email;
        Password = password;
    }

    public String UserName;
    public String Email;
    public String Password;

    public User toUser(){
        return new User(UserName,Email,Password, true);
    }
}
