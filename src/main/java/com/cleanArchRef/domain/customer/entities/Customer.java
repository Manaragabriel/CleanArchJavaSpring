package com.cleanArchRef.domain.customer.entities;

import java.util.Objects;

public class Customer {



    public int Id;
    public String FullName;
    public String Email;
    public String Cpf;
    public String Phone;

    public Customer(int id, String fullName, String email, String cpf, String phone) {
        Id = id;
        FullName = fullName;
        Email = email;
        Cpf = cpf;
        Phone = phone;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", FullName='" + FullName + '\'' +
                ", Email='" + Email + '\'' +
                ", Cpf='" + Cpf + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Id == customer.Id && Objects.equals(FullName, customer.FullName) && Objects.equals(Email, customer.Email) && Objects.equals(Cpf, customer.Cpf) && Objects.equals(Phone, customer.Phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, FullName, Email, Cpf, Phone);
    }

}
