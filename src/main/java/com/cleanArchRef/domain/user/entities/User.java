package com.cleanArchRef.domain.user.entities;

public class User {

    public int Id;
    public String UserName;
    public String Email;
    public String Password;
    public Boolean IsActive;

    public User( String userName, String email, String password, Boolean isActive) {
        UserName = userName;
        Email = email;
        Password = password;
        IsActive = isActive;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", UserName='" + UserName + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", IsActive=" + IsActive +
                '}';
    }

}
