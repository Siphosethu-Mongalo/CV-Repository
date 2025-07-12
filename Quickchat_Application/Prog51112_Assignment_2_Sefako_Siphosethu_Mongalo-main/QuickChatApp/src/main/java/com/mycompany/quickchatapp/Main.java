/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchatapp;

/**
 *
 * @author sethu
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Username contains an underscore and is no more than 5 characters long
        System.out.println("Welcome to Quick Chat App");
        System.out.print("Enter username(must contain _ and be at least 5 characters):");
        String username = scanner.nextLine();
        
        System.out.print("Enter password (must be at least 8 characters, number, special character):");
        String password = scanner.nextLine();
        
        System.out.print("Enter south african cell phone numner(with international code):");
       String cellphone = scanner.nextLine();
       
       System.out.print("Enter your first name: ");
       String firstName = scanner.nextLine();
       
       System.out.print("Enter your last name: ");
       String lastName = scanner.nextLine();
       
       Login user = new Login(username, password, cellphone, firstName, lastName);
       
       System.out.println(user.registerUser());
       
       //login Phase
       
       System.out.println("\nLogin To Quick Chat");
       System.out.print("Enter username:");
       String loginUsername = scanner.nextLine();
       
       System.out.print("Enter Password: ");
       String loginPassword = scanner.nextLine();
       
       boolean loginStatus = user.loginUser(loginUsername, loginPassword);
       System.out.println(user.returnLoginStatus(loginStatus));
       
       if (!loginStatus){
           System.exit(0);
       }
       
       // chat Application
       System.out.println("\nWelcome to Quick Chat."); // the displaying of the welcome message
       
       System.out.print("How many messages would you like to send?");
       int messageCount = Integer.parseInt(scanner.nextLine());
       int messageSent = 0;
       
       while(true){
           System.out.println("\nMenu:");
           System.out.println("1) Send Messages");
           System.out.println("2) Show recently sent messages");
           System.out.println("3 Quit");
           System.out.print("Choose an Option: ");
           
           int choice = Integer.parseInt(scanner.nextLine());
           
           switch (choice){
               case 1:
                   if (messageSent >= messageCount){
                       System.out.println("You have reached your limit");
                   
                   break;
           }
           
           System.out.print("Enter recipient cell phone number(with international code):");
           String recipient = scanner.nextLine();
           
           System.out.print("Enter your message of (max 250 characters)");
           String messageText = scanner.nextLine(); // a short message that does not exceed 250 words
           
           Message msg = new Message(recipient, messageText);
           String sendResult = msg.sentMessage();
           
           if (sendResult.equals("Message Sent")){
               System.out.println("Choose An Option:");
               System.out.println("1) Send Message");
               System.out.println("2) Discard Message");
               System.out.println("3) Store Message To Send Later");
               System.out.print("Your Choice:");
               
               int sendChoice = Integer.parseInt(scanner.nextLine());
               
               switch (sendChoice){
                   case 1:
                       msg.storeMessage();
                           messageSent++;
                           System.out.println("Message send successfully!!!");
                           break;
                           
                   case 2: 
                       System.out.println("Message discard");
                   break;
                   
                   case 3: msg.storeMessage();
                   System.out.println("Message stored for later");
                   break;
               }
           }else {
               System.out.println(sendResult);
           }
           break;
           
           case 2: 
                System.out.println("Coming Soon!!!");
                break;
                
            case 3: 
                System.out.println("Goodbye!");
                System.exit(0); // the application should run until the user selects quit to exit
                break;
                
                default:
                System.out.println("Invalid choice. please try again");
       }
    }
    }
}

