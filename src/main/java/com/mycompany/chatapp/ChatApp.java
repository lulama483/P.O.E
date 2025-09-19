/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class ChatApp {

  
    public static void main(String[] args) {
         registration keys = new registration();
     
      Scanner scanner = new Scanner(System.in);

      String firstname;
      String username;
      String password;
      String cellphone;
      
      
      //First name
        System.out.println("Enter your firstname and Surname: ");
        firstname = scanner.nextLine();
        
        do{
        //username
        System.out.print("Enter username(max 5 characters, must contain an underscore): ");
         username = scanner.nextLine();
        if(keys.checkUsername(username)){
            System.out.println("Username successfully captured.");
        }else{
             System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        }while(!keys.checkUsername(username));

        do{
        //passsword
        System.out.print("Enter password (min 8 characters, at least one capital letter, one number, and one special character): ");
        password = scanner.next();

        if(keys.checkPasswordComplexity(password)){
            System.out.println("Password successfuly captured");
        } else{
            System.out.println("Password is not correctly foormatted; please ensure that password contains atleast eight characters, a capital letter, a number and  a special character.");

         }
        }while(!keys.checkPasswordComplexity(password));
        
        do{
        //cell phone number
        System.out.print("Enter South African cell phone number (format: +27xxxxxxxxx ): ");
        cellphone = scanner.next();
        
        if(keys.checkCellPhoneNumber(cellphone)){
            System.out.println("Cellphone Number successfully added");
        }else{
            System.out.println("Cellphone number incorrectly formatted or does not contain international code.");
        }
        } while(!keys.checkCellPhoneNumber(cellphone));
       

             
        //login
        String isLogin;
        
        
        login login = new login( username, password, firstname);
         System.out.println("Enter login username: ");
         String enteredUsername = scanner.nextLine().trim();
         scanner.next();
        
         
         System.out.println("Enter login password");
         String enteredPassword = scanner.nextLine().trim();
         scanner.next();
                 
         // the login result message  
        Boolean success =  login.loginUser(enteredUsername, enteredPassword);
         
         
          if (success){
              System.out.println("Username or password is incorrect, please try again.");
           isLogin = "failure";
            } else{
            System.out.println("Heyy Welcome " + firstname + " it is great to see you again pookie.");
              isLogin ="success";
        }
         
         
        scanner.close();
    }
}
      

