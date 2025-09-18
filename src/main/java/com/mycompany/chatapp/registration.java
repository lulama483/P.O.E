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
    // checks is there is an underscore(_) 
    //and is no more than five char long
     public  boolean checkUsername(String username) { //validate username
       return username.contains("_")&& username.length()<=5;
     }//end of checkUsername
     
     
    //password
     //checks if it is at least 8 char long
     // if it contains a capital letter
     //if it contains a number
     //if it contains a special char
    public boolean checkPasswordComplexity(String password){ //valiate password
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
    }//end of checkPasswordComplexity
    
    //Cellphone Number
   //checks if the cellphone number contains the international country code
    //then the number with no more than 10 char long
    public boolean checkCellPhoneNumber(String cellphone){
        return cellphone.contains("+27") && cellphone.length() == 12;
    }//end of checkCellPhoneNumber
    
    
    
} // end of class
