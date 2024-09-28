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
    public boolean checkUsername(String username ){
        System.out.println("Register name, surname and password");
        System.out.println("Please enter name");
        name=fil.next();
         System.out.println("Please enter surname");
        lastname=fil.next();
          System.out.println("Please enter username");
        username=fil.next();
        if(username.contains("_")
                &&
                username.length()<=5){
         System.out.println("Welcome "+name+" "+lastname);}
         else{
                 System.out.println(name+"!!");
                 }
        
        return false;
    }

    /**
     *
     * @return
     */
    public boolean checkPasswordComplexity(String password){
       
         System.out.println("Please enter password");
        password=fil.next();
        if(!password.matches("1234567890")&&!password.matches("[!@#$%^&*(){}<>?/|]")&&password.length()>=8){
          System.out.println("Password successfully captured");}
          else{
               System.out.println("Password fail!");
                  }
        
        return false;
    }
    public String registerUser(){
        if(checkUsername(username)==true&checkPasswordComplexity(password)==true){
          return"Register successfull";  
        }
        else{
            return "Register Fail";
        }
    }

    /**
     *
     * @return
     */
    public  boolean loginUser(boolean login){
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
        if(loginUser(login)){
            return "Login successfull";
        }
        else {while(username.equals(username)&&password.equals(password)){
                loginUser(login);
           
            
            }
        }
         return"Login fail";
    }
}
