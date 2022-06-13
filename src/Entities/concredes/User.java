package Entities.concredes;

import Entities.Abstracts.Entities;

public class User implements Entities {
    
    public String firstName;
    public String lastName;
    public String password;
    public String mail;

    public User(String firstName, String lastName, String password, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }



}
