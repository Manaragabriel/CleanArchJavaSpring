package com.cleanArchRef.infrastructure.database.user.models;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "_user")
public class UserModel {


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public int Id;

    @Column(name = "user_name", length = 255, nullable = false)
    public String UserName;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    public String Email;

    @Column(name = "password", length = 255, nullable = false)
    public String Password;

    @Column(name = "is_active", columnDefinition = "tinyint(1) default 1")
    public Boolean IsActive;
}
