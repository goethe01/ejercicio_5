/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_5;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float radio, area, longitud;
        
        System.out.append("dame el radio del circulo: ");
        radio= entrada.nextFloat();
        
        area = (float) (Math.pow(radio,2) * Math.PI);
        longitud = (float) (2 * Math.PI * radio);
        
        System.out.println("EL AREA DE LA CIRCUNFERENCIA ES: "+ area);
        System.out.println("LA LONGITUD DE LA CIRCUNFERENCIA ES: "+ longitud);
    }
}