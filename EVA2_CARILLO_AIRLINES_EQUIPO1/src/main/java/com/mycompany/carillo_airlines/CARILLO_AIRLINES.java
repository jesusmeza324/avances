/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carillo_airlines;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class CARILLO_AIRLINES {

    public static void main(String[] args) {
        String user1,pw1;
        int i=3;
        final String User1="USER1";
        final String Pw1="1234";
        final String User2="USER2";
        final String Pw2="1234";
        final String User3="USER3";
        final String Pw3="1234";
        final String User4="USER4";
        final String Pw4="1234";
        final String User5="USER5";
        final String Pw5="1234";
        Scanner cap = new Scanner(System.in);
        while(i>0){
        System.out.println("Digite usuario:");
        user1=cap.nextLine();
       
        System.out.println("Digite la contraseña:");
        pw1=cap.nextLine();
       
       if(user1.equals(User1)&&pw1.equals(Pw1)){
           System.out.println("BIENVENIDO USUARIO1!!");
           break;
       }
       if(user1.equals(User2)&&pw1.equals(Pw2)){
           System.out.println("BIENVENIDO USUARIO2!!");
           break;
       }
       if(user1.equals(User3)&&pw1.equals(Pw3)){
           System.out.println("BIENVENIDO USUARIO3!!");
           break;
       }
       if(user1.equals(User4)&&pw1.equals(Pw4)){
           System.out.println("BIENVENIDO USUARIO4!!");
           break;
       }
       if(user1.equals(User5)&&pw1.equals(Pw5)){
           System.out.println("BIENVENIDO USUARIO5!!");
           System.out.println("Funciones a realiza:");
           System.out.println("User1");
           System.out.println("User2");
           System.out.println("User3");
           System.out.println("User4");
           System.out.println("Verificacion y Correccion de datos");
           System.out.println("¿Que funcion desea realizar?");
           user1=cap.nextLine();
           if(user1.equals(User1)){
           System.out.println("BIENVENIDO USUARIO1!!");
               
       }
       if(user1.equals(User2)){
           System.out.println("BIENVENIDO USUARIO2!!");
           
       }
       if(user1.equals(User3)){
           System.out.println("BIENVENIDO USUARIO3!!");
           
       }
       if(user1.equals(User4)){
           System.out.println("BIENVENIDO USUARIO4!!");
         
       }
       if(user1.equals(User5)){
           System.out.println("Verificacion de datos o Correcccion");
         
       }
           
           break;
       }else{
           i--;
           System.out.println("CONTRASEÑA O USUARIO INCORRECTO!!"+"INTENTE DE NUEVO!!");
       }
    }
    }
}
