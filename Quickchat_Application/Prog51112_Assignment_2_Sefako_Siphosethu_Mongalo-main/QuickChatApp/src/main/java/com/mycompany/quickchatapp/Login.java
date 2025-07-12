/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchatapp;

/**
 *
 * @author sethu
 */
import java.util.regex.*;


public class Login {
    private String username;
    private String password;
    private String cellphone;
    private String firstName;
    private String lastName;
    
    public Login(String username, String password, String cellphone, String firstName, String lastName){
        this.username = username;
        this.password = password;
        this.cellphone = cellphone;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public boolean checkUserName(){ //this method ensures that any username contains an underscore (_) and is no more than 

        return username.contains("_")&& username.length() <=5;
    }
    
    public boolean checkPasswordComplexity(){ //this method ensures that passwords meet the following password complexity rules. at least 8 characters long, contain a capital letter, contains a number, contains a special character.

        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*")&&
                password.matches(".*[!@#$%^&*<>/?].*");
        
    }
    
    public boolean checkCellPhoneNumber(){ //this method ensures that the cellphone is correct length and contains the international code.

        return cellphone.matches("^\\+\\d{1,3}\\d{7,10}$") && cellphone.length() <=13;
        
        }
    
        public String registerUser(){ //this method returns the necessary registration messaging indicating if the username is correctly formatted, the password does not meet the complexity requirements, two of the conditions have been met, and the user has been registered successfully.

            StringBuilder message = new StringBuilder();
            
            if(!checkUserName()){
                message.append("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.\n");
                
            }else {
                message.append("Username successfuly captured.\n");
            }
            
            if (!checkPasswordComplexity()){
                message.append("Password is not correctly formatted; please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.\n");
            }else {
                message.append("Password successfully captured.\n");
            }
            
            if (!checkCellPhoneNumber()){
                message.append("cell phone number incorrectly formatted or does not contain interational code.\n");
            }else {
                message.append("cell phone number sucessfully captured");
            }
            
            return message.toString();
        }
            
        public boolean loginUser(String enteredUsername, String enteredPassword){
            return enteredUsername.equals(username)&& enteredPassword.equals(password);
        }
        
        public String returnLoginStatus(boolean loginStatus){
            if (loginStatus){
                return "Welcome " + firstName + ", " + lastName + "it is great to seen you again";
            }else {
                return "Username or password incorrect, please try again";
            }
        }
        
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
    
    
}