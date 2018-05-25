/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

/**
 *
 * @author Daniela Chavez
 */
public class Dividir implements aritmetico{

    @Override
    public float calcular(float a, float b) {
        float aux;
       aux= a/b;
       return aux;
    }


}
