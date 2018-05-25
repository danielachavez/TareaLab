/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Aritmetica.Aritmetica;
import Aritmetica.Dividir;
import Aritmetica.Multiplicar;
import Aritmetica.Restar;
import Aritmetica.Sumar;

/**
 *
 * @author Daniela Chavez
 */
public class Arit extends Abs {
   @Override
  
        public Aritmetica getAritmetica(String tipo){
        switch(tipo){
            case "Suma":
                return new Sumar();
            case "Resta":
                return new Restar();
            case "Multiplicacion":
                return new Multiplicar();
            case "Division":
                return new Dividir();
        }
        return null;
        }

}
