/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author Daniela Chavez
 */
public class Fabrica {
   public static Abs getfabrica(String tipo){
       if(tipo.equalsIgnoreCase("Aritmetica")){
           return new Arit();
       }
       return null;
   } 
}

