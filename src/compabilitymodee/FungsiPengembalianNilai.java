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
public class FungsiPengembalianNilai {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 Nilai");
        System.out.print("Masukan nilai a : ");
        a =  masukan.nextInt();
        System.out.print("Masukan nilai b : ");
        b = masukan.nextInt();
        System.out.print("Masukan Nilai c : ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b :"+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
    }
    private static int jumlah(int a, int b){
        int hasil = a+b;
        return hasil;
    }
    
}
