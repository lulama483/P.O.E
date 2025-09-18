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
    private String Firstname;
    
    public login(String username, String password, String firstname){
        this.enteredUsername = username;
        this.enteredPassword = password;
        this.Firstname = firstname;
    }
    public Boolean loginUser(String username, String password, String firstname){
        return this.enteredPassword.equals(password) && this.enteredUsername.equals(username)&& this.Firstname.equals(firstname); // will return whether true or false
                
    }
    
    //display the messege for login success
    public String returnLoginStatus(String username, String password, String firstname){
        if(loginUser(username, password, firstname)){
             return "Heyy Welcome" + firstname + " it is great to see you again pookie.";
        } else{
            return "Username or password is incorrect, please try again.";
        }
           
    
    }
    
}
