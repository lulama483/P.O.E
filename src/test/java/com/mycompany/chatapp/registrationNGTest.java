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
public class registrationNGTest {
    
    public registrationNGTest() {
    }

    registration keys = new registration();
    /**
     * Test of checkUsername method, of class registration.
     */
    @Test
    public void testCheckCorrectUsername() {
        Assert.assertTrue(keys.checkUsername("kyl_1"));
    }
    
    @Test
    public void testInvaliUsername(){
        Assert.assertFalse(keys.checkUsername("kyle!!!!!!!"));
    }

    /**
     * Test of checkPasswordComplexity method, of class registration.
     */
    @Test
    public void testCheckCorrectPasswordComplexity() {
        Assert.assertTrue(keys.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testInvalidPasswordComplexity(){
        Assert.assertFalse(keys.checkPasswordComplexity("password"));
    }

    /**
     * Test of checkCellPhoneNumber method, of class registration.
     */
    @Test
    public void testCheckCorrectCellPhoneNumber() {
        Assert.assertTrue(keys.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test
    public void testInvalidCellphoneNumber(){
        Assert.assertFalse(keys.checkCellPhoneNumber("08966553"));
    }
    
}
