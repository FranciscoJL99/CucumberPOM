package com.advantageonlineshopping.automation.models;

public class Data {
    private String userName;
    private String email;
    private String password;

    public Data(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
