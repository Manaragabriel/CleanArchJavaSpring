package com.cleanArchRef.api.controllers;

import com.cleanArchRef.application.useCases.createUser.CreateUserUseCase;
import com.cleanArchRef.application.useCases.createUser.InputCreateUserDTO;
import com.cleanArchRef.application.useCases.createUser.OutputCreateUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CreateUserUseCase _createUseCase;

    @GetMapping
    public String getUserText() {
        return "user";
    }
    @PostMapping
    public ResponseEntity<OutputCreateUserDTO> create(InputCreateUserDTO input){
        OutputCreateUserDTO outputCreate = _createUseCase.execute(input);
        return ResponseEntity.status(201).body(outputCreate);
    }

}
