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
    //declaring our username , password and firstname
    private String Username;
    private String Password;
    private String Firstname;
    
    public login(String username, String password, String firstname){
        this.Username = username;
        this.Password = password;
       this.Firstname = firstname;
    }
    public Boolean loginUser(String enteredUsername, String enteredPassword){
        return this.Password.equals(enteredPassword) && this.Username.equals(enteredUsername) ; // will return whether true or false
                
    }
    
    //display the messege for login success
    public String returnLoginStatus(String enteredUsername, String enteredPassword, String enteredFirstname){
        
        if (enteredUsername.equals(Username)&& enteredPassword.equals(Password)){
           
              return "Heyy Welcome " + Firstname + " it is great to see you again pookie.";
        } else{
           return "Username or password is incorrect, please try again.";
        }
           
    
    }
    
    }

