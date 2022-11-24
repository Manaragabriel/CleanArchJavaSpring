package com.cleanArchRef.infrastructure.database.user.models;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {


    public UserModel(String userName, String email, String password, Boolean isActive) {
        UserName = userName;
        Email = email;
        Password = password;
        IsActive = isActive;
    }


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public int Id;

    @Column(name = "UserName", length = 255, nullable = false)
    public String UserName;


    @Column(name = "Email", length = 255, nullable = false, unique = true)
    public String Email;

    @Column(name = "Password", length = 255, nullable = false)
    public String Password;

    @Column(name = "IsActive", columnDefinition = "tinyint(1) default 1")
    public Boolean IsActive;
}
