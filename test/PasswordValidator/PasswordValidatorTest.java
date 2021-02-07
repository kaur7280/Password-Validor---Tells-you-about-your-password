/*
Name:Ramneek Kaur
Student ID: 991555460
ICE-4
 */
package PasswordValidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ramne
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("class start");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("class finish");
    }
    
    @Before
    public void setUp() {
        System.out.println("method start");
    }
    
    @After
    public void tearDown() {
        System.out.println("method stop");
    }


    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a good input of 1234567890, which should
     * easily be long enough to be a good length
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String pass = "1234567890";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);//check weather the expected result is same as the result or not
        //assertEquals if it is same it will say my result is pass
        //otherwise give error
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //this tell us that by default it will fail 
    }
    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a bad input of 1234567, which should
     * tell us that pass do not has valid length of 8 or more characters
     */
     @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthbad");
        String pass = "1234567";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);//check weather the expected result is same as the result or not
       
    }
    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a boundary input of 12345678, which should
     * tell us that pass should have length of 8 or more characters
     */
    
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLengthBoundary");
        String pass = "12345678";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);//check weather the expected result is same as the result or not
      
    }

   /**
     * Test of checkCase method, of class PasswordValidator.
     * This test gives a good input of RAMNEEK123, which should
     * tell us that password has an uppercase that is good enough to have good password
     */
     
    @Test
    public void testCheckCaseGood() {
        System.out.println("checkCaseGood");
        String password = "RAMNEEK123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkCase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /**
     * Test of checkCase method, of class PasswordValidator.
     * This test gives a bad input of ramneek123, which should
     * tell us that password do not has any upperCase character 
     */
    
    @Test
    public void testCheckCaseBad() {
        System.out.println("checkCaseBad");
        String password = "ramneek123";
        boolean expResult = false;
        boolean result = PasswordValidator.checkCase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /**
     * Test of checkCase method, of class PasswordValidator.
     * This test gives a boundary input of Ramneek123, which should
     * tell us that password has exactly one uppercase character 
     */
    
@Test
    public void testCheckCaseBoundary() {
        System.out.println("checkCaseBoundary");
        String password = "Ramneek123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkCase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
       /**
     * Test of checkSpecialCharacter method, of class PasswordValidator.
     * This test gives a good input of Ramnee#k@20, which should
     * tell us that pass has special characters which is good enough to have a good password
     */
    
    @Test
    public void testCheckSpecialCharacterGood() {
        System.out.println("checkSpecialCharacterGood");
        String pass = "Ramnee#k@20";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
         /**
     * Test of checkSpecialCharacter method, of class PasswordValidator.
     * This test gives a bad input of Ramneek1220, which should
     * tell us that pass has no special characters
     */
    
     @Test
    public void testCheckSpecialCharacterBad() {
        System.out.println("checkSpecialCharacterBad");
        String pass = "Ramneek1220";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }  
    /**
     * Test of checkSpecialCharacter method, of class PasswordValidator.
     * This test gives a boundary input of Ramneek@210, which should
     * tell us that pass has exactly one special character
     */
    
     @Test
    public void testCheckSpecialCharacterBoundary() {
        System.out.println("checkSpecialCharacterBoundary");
        String pass = "Ramneek@210";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

      
}
