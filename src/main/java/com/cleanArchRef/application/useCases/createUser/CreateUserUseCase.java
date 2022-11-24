package com.cleanArchRef.application.useCases.createUser;

import com.cleanArchRef.application.services.UserService;
import com.cleanArchRef.application.shared.IUseCase;
import com.cleanArchRef.domain.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("createUserUseCase")
public class CreateUserUseCase implements IUseCase<InputCreateUserDTO, OutputCreateUserDTO> {

    @Autowired
    public UserService _userService;

    @Override
    public OutputCreateUserDTO execute(InputCreateUserDTO input) {
        User newUser = _userService.createUser(input.toUser());
        return new OutputCreateUserDTO(newUser.getId(), newUser.getUserName(), newUser.getEmail());
    }
}
