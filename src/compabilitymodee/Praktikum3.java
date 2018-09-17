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
public class Praktikum3 {
    public static void main(String[] args){
       String nama, nis, tmpt_lahir, tgl_lahir, jenis_klmn, alamat, motto_hidup;
       Scanner biodata = new Scanner(System.in);
    System.out.print("Nama : ");
    nama = biodata.nextLine();
    System.out.print("NIS : ");
    nis = biodata.nextLine();
    System.out.print("Tempat Lahir : ");
    tmpt_lahir = biodata.nextLine();
    System.out.print("Tanggal Lahir : ");
    tgl_lahir = biodata.nextLine();
    System.out.print("Jenis Kelamin : ");
    jenis_klmn = biodata.nextLine();
    System.out.print("Alamat di Malang : ");
    alamat = biodata.nextLine();
    System.out.print("Motto Hidup : ");
    motto_hidup = biodata.nextLine();
    
    System.out.println("==================================");
    System.out.println("Nama : " + nama);
    System.out.println("NIS : "+ nis);
    System.out.println("Tempat Lahir : "+tmpt_lahir);
    System.out.println("Tanggal Lahir : " + tgl_lahir);
    System.out.println("Jenis Kelamin : " + jenis_klmn);
    System.out.println("Alamat di Malang : "+ alamat);
    System.out.println("Motto Hidup : "+ motto_hidup);
}}
