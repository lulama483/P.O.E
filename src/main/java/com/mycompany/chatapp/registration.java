/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author RC_Student_lab
 */
public class registration {
    //username
     public  boolean validateUsername(String username) { //validate username
       return username.contains("_")&& username.length()<=5;
     }
    //password
    public boolean validatePassword(String password){ //valiate password
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        
        if(password.length()< 8){
            
        return false;
        }
        
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c)){
                hasUppercase = true;
            }else if (Character.isDigit(c)){
                hasNumber = true;
             }else if (!Character.isLetterOrDigit(c)){
                 hasSpecialChar = true;
             }
            }
        return hasUppercase && hasNumber && hasSpecialChar;
    }
    

    public boolean checkPhoneNumber(String cellphone){
        return cellphone.startsWith("+27") && cellphone.length() == 11;
    }
}
