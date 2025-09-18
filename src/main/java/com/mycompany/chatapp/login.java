/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author RC_Student_lab
 */
public class login {
    private String enteredUsername;
    private String enteredPassword;
    
    public login(String username, String password){
        this.enteredUsername = username;
        this.enteredPassword = password;
    }
    public Boolean loginUser(String username, String password){
        return this.enteredPassword.equals(password) && this.enteredUsername.equals(username); // will return whether true or false
                
    }
    
    //display the messege for login success
}
