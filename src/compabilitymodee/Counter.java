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
public class Counter {
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
       System.out.print("Masukan bata bilangan: ");
       int batas = masukan.nextInt();
       int hasil = 0;
       for(int i=1; i<batas; i++)
       hasil += i;
       System.out.println("Total umlahnya adalah : "+hasil);
    }
}
