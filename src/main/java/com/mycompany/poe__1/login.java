/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe__1;

import java.util.Scanner;

/**
 *
 * @author unathi
 */
public class login {
     private String name,lastname,password,username;
    Scanner fil= new Scanner(System.in);
    

    /**
     *
     * @return
     */
    public boolean checkUsername( ){
        System.out.println("Register name, surname and password");
        
        //prompt the user to enter the initials
        
        System.out.println("Please enter name");
        name=fil.next();
         System.out.println("Please enter surname");
        lastname=fil.next();
          System.out.println("Please enter username");
        username=fil.next();
          
        //testing the username to meet the requirements of 5 characters and have underscore
          
        if(username.contains("_")
                &&
                username.length()<=5){
         System.out.println("Welcome "+name+" "+lastname);}
         else{
                 System.out.println(name+"!!\n"+"contain underscore(_) and maximum of 5 character");
                 }
        
        return false;
    }

    /** https://github.com/UN101-air/poe1.git
     *
     * @return
     */
    public boolean checkPasswordComplexity(){
        
       //prompt the user to enter password
       
         System.out.println("Please enter password");
        password=fil.next();
        
        //testing the password
        
        if(!password.matches("1234567890")&&
                !password.matches("[!@#$%^&*(){}<>?/|]")&&
                !password.matches(".[A-Z]")&&
                password.length()>=8){
          System.out.println("Password successfully captured");
        }
          else{
            System.out.println("Password fail!\n"
                    + "Have capital letters ,numbers[1,2,3,4,5,6,7,8,9,0], special character[!@$%^&*]and minimum 8 character long");
                  }
              
        
        return false;
    }
    public String registerUser(){
        
        //do both method successful?
        
        if(checkUsername()!=true&&checkPasswordComplexity()!=true){
          while(checkUsername()==true&&checkPasswordComplexity()==true){
             checkUsername(); 
          }
           
           
            
        }
        else{
         return "Register Successful";    
        }   
               
     return"Register Unsuccessful";  
    
    }

    /**
     *
     * @return
     */

    /**
     *
     * @param login
     * @return
     */
    public  boolean loginUser(boolean login){
        
        //prompting the user: username and password
        
        System.out.println("Login username and Password");
         System.out.println("Enter username");
        username=fil.next();
        System.out.println("Enter password");
        password=fil.next();
       return username.equals(username)&&password.equals(password);
        }
       
    

    /**
     *
     * @param login
     * @return
     */
    public  String returnLoginStatus(boolean login){
        
        //does the login matches with the register username and password
        
        if(loginUser(login)){
            return "Login successfull";
        }
        if(!username.equals(username)&&!password.equals(password)){ {while(username.equals(username)&&password.equals(password)){
                loginUser(login);
           
            
            }
        return"Login fail"; }
         
    }
        
 return"Login fail"; }
}

