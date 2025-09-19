/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author RC_Student_lab
 */
public class loginNGTest {
    
    public loginNGTest() {
    }
 login user = new login("Kyl_1", "Ch&&sec@ke99!", "Kyle gyen");

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        Assert.assertTrue(user.loginUser("Kyl_1", "Ch&&sec@ke99!", "Kyle gyen"));
        
    }
    
    @Test
    public void testUnsuccessfulLogin(){
        Assert.assertFalse(user.loginUser("Kyle!!!!!!", "password","Kyle99865"));
    }
}

    