/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe__1;
import java.util.Scanner;

/**
 *
 * @author unathi
 */
public class Poe__1 {
// String name,lastname,password,username;
//Scanner fil= new Scanner(System.in);
    public static void main(String[] args) {
        login ful= new login();
        ful.registerUser();
        ful.returnLoginStatus(true);
        
    }
//    public boolean checkUsername(){
//        System.out.println("Please enter name");
//        name=fil.next();
//         System.out.println("Please enter surname");
//        lastname=fil.next();
//          System.out.println("Please enter username");
//        username=fil.next();
//        if(username.contains("_")&&username.length()=<5){
//         System.out.println("Welcome "+name+" "+lastname);
//        }
//        return false;
//    }
//    public boolean checkPasswordComplexity(){
//         System.out.println("Please enter password");
//        password=fil.next();
//        if(password.length()=>8&&password.matches("!@#$%^&*_=")&&password.matches("123456789")){
//          System.out.println("Password successfully captured");}
//          else{
//               System.out.println("Password fail!");
//                  }
//        
//        return false;
//    }
//    public String registerUser(){
//        if(checkUsername()==true&&checkPasswordComplexity()==true){
//          return "Register successfull";  
//        }
//        else{
//            return "Register Fail";
//        }
//    }
//    public boolean loginUser(){
//         System.out.println("Enter username");
//        username=fil.next();
//        System.out.println("Enter password");
//        password=fil.next();
//        if(username&&password.equals(registerUser())){
//            returnLoginStatus();
//        }
//        return false;
//    }
//    public String returnLoginStatus(){
//        if(username.equals(username)&&password.equals(password)){
//            return "Login successfull";
//        }
//        else {
//            return"Login fail";
//        }
//    }
}
