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
      login obj = new login();
      Scanner scanner = new Scanner(System.in);

        //username
        System.out.print("Enter username(max 5 characters, must contain an underscore): ");
        String username = scanner.nextLine();
        if(keys.validateUsername(username)){
            System.out.println("Username successfully captured.");
        }else{
             System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        //passsword
        System.out.print("Enter password (min 8 characters, at least one capital letter, one number, and one special character): ");
        String password = scanner.nextLine();

        if(keys.validatePassword(password)){
            System.out.println("Password successfuly captured");
        } else{
            System.out.println("Password is not correctly foormatted; please ensure that password contains atleast eight characters, a capital letter, a number and  a special character.");

         }
        
        System.out.print("Enter South African cell phone number (format: +27xxxxxxxxx or 27xxxxxxxxx or 0xxxxxxxxx): ");
        String cellphone = scanner.nextLine();
        
        if(keys.checkPhoneNumber(cellphone)){
            System.out.println("Cellphone Number successfully added");
        }else{
            System.out.println("Celphone number incorrectly formatted or does not contain international code.");
        }
        System.out.println("hi");

    }
}
