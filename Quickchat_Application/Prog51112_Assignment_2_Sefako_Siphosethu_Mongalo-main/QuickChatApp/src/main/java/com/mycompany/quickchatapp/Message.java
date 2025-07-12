/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchatapp;

/**
 *
 * @author sethu
 */

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;  // to generate random numbers
import org.json.simple.JSONObject; //for creating JSON Objects 
import java.io.FileWriter; // a file for writing operations
import java.io.IOException;

public class Message { // class variables with an appropriate data type
    private String MessageID;
    private int messageNumber;
    private String recipient;
    private String messageHash;
    private String messageText;
    private static int totalMessages = 0;
    private static List<Message> messages = new ArrayList<>();


public Message(String recipient, String messageText){
    this.MessageID = generateMessageID();
    this.messageNumber = ++totalMessages;
    this.recipient = recipient;
    this.messageText = messageText;
    this.messageHash = createMessageHash();
}

private String generateMessageID(){
    Random rand = new Random(); // creates random objects
    return String.format("%010d", rand.nextInt(1000000000)); // formats as 10- digit strings
}

public boolean checkMessageID(){ //THIS METHOD ENSURES that the message ID is no more than 10 characters

    return MessageID.length() == 10;
}

public boolean checkRecipientCell(){ //this method ensures that the recipient cell number is no more than 10 characters long and starts with.

    return recipient.matches("^\\+\\d{1,3}\\d{9,10}$");
}

public String createMessageHash(){ //this message creates and returns the message hash.

    String[] words = messageText.split("\\s+");
    String firstTwoLetters = messageText.substring(0, Math.min(2, messageText.length()));
    
    String firstWord = words.length > 0 ? words[0] : "";
    String lastWord = words.length > 1 ? words[words.length-1] : firstWord;
    
    return (firstTwoLetters + ":" + firstWord + lastWord).toUpperCase();
}

public String sentMessage(){ //this method should allow the user to choose if they want to send, store or discard the message

    if (messageText.length() > 250){
        return "please enter a message of less than 250 characters";
    }
    
    if (!checkRecipientCell()){
        return "recipient cell number is incorrectly formatted";
    }
    
    return "message sent";
}

public static String printMessages(){ //this method returns a list of all the messages sent while the program is still running.

    StringBuilder sb = new StringBuilder(); // this creates a string builder
    for (Message msg : messages){ // loops through all the messages
        sb.append("ID: ").append(msg.MessageID)
             .append(", # ").append(msg.messageNumber)
                     .append(", TO: ").append(msg.recipient)
                             .append(", Hash ").append(msg.messageHash)

                                     .append("\n"); // this adds a new line after each message sent

    }
    return sb.toString();
}

public static int returnTotalMessages(){ //this method returns the total number of messages sent.

    return totalMessages;
}

public void storeMessage(){ // stores the message and writes to json file 
    messages.add(this);
    
    JSONObject json = new JSONObject(); //method create a method to store the message in JSON

    json.put("messageID", MessageID);
    json.put("messageNumber", messageNumber);
    json.put("recipient", recipient);
    json.put("messageText", messageText);
    json.put("messageHash", messageHash);
    
    try (FileWriter file=  new FileWriter("messages.json", true)){
        file.write(json.toString() + "\n");
    }catch (IOException e){
            e.printStackTrace(); // prints a stack trace if the IO error is occuring
            }
}
}