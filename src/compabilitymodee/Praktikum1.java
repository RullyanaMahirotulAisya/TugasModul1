/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compabilitymodee;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Praktikum1 {
    public static void main (String[] args){
        //menghitung luas permukaan bola
        Scanner masukan = new Scanner(System.in);
        double phi = 3.14;
        System.out.print("masukan jari2 : ");
        double r = masukan.nextInt();
        System.out.println("Luas permukaan balok=" + 4*phi*r*r);
        
    }
    
}
