/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compabilitymodee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class Praktikum2 {
    public static void main (String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double celcius, hasilreamur, hasilfahrenheit, hasilkelvin;
        System.out.print("Masukan suhu dalam celcius: ");
        celcius = Integer.parseInt(input.readLine());
        System.out.println("");
        System.out.println("1.Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Masukan pilihan : ");
        int pilih = Integer.parseInt(input.readLine());
        System.out.println("");
        
        switch(pilih){
            case 1 :
                hasilreamur = celcius*4/5;
                System.out.println(celcius + "Celcius = " + hasilreamur + "Reamur");
                break;
            case 2 :
                hasilfahrenheit = (celcius*9/5)+32;
                System.out.println(celcius + "Celcius = " + hasilfahrenheit + "Fahrenheit");
                break;
            case 3 :
                hasilkelvin = celcius+273.15;
                System.out.println(celcius + " Celcius = "+ hasilkelvin + "Kelvin");
                break;
            default:
                System.out.println("Pilihan yang anda masukan salah");
                break;
                
        }
    }
}
