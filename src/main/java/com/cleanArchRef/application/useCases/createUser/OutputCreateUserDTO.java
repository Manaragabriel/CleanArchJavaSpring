package com.cleanArchRef.application.useCases.createUser;

public class OutputCreateUserDTO {

    public OutputCreateUserDTO(int id, String userName, String email) {
        Id = id;
        UserName = userName;
        Email = email;
    }

    public int Id;
    public String UserName;
    public String Email;

}
