package com.example.bugsv2;

public class User {

    public String name,surname,birthday,password,email;

    public User(){

    }


    public User(String name, String surname, String email, String birthday, String password){
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }


}

