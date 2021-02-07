/*
Name: Ramneek Kaur
Student ID: 991555460
ICE-4
 */
package PasswordValidator;

import java.util.Scanner;

/**
 *
 * @author ramne
 */
public class PasswordValidator {
    
    
    public static void main(String[] args) {
        boolean isValid=false;
        do
        {
            System.out.println("Please enter a VALID password, password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            if (checkLength(pass) && checkCase(pass) && checkSpecialCharacter(pass))
            {
               isValid=true;
            }
        }while(!isValid);
        System.out.println("Valid password, accepted!");
    }
    /**
     * A method to check whether a password has at least length 8 
     * @param pass - the String to check
     * @return true if length is greater than
     * or equal to 8
     */
    public static boolean checkLength(String pass)
    {
        if(pass.length()>=8)
        {
          return true;
        }
    return false;
    }
    /**
     * A method to check whether a password is at least one uppercase character 
     * @param password - the String to check
     * @return true if there is one or more uppercase characters
     */
    public static boolean checkCase(String password){
    char check[] = password.toCharArray();
    for(char sub : check)
    {
    if(Character.isUpperCase(sub))
        return true;
    }
    
    return false;
    }
    /**
     * A method to check whether a password has at least one special character 
     * @param pass - the String to check
     * @return true if it has one or more special character
     */
    public static boolean checkSpecialCharacter(String pass){
    char check[] = pass.toCharArray();
    for(char sub : check)
    {
   if(!Character.isLetter(sub) && !Character.isDigit(sub))
        return true;
    }
    
    return false;
    }
}
