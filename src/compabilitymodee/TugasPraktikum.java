/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compabilitymodee;

/**
 *
 * @author WINDOWS 10
 */
public class TugasPraktikum {
    //huruf I
      public static void main(String[] args){
        int x, y;
        
        for(x=1;x<=6 ;x++) {
            for(y=1;y<=3;y++){
                if(x==6||x==1||y==2||y==0){
                    System.out.print("@");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
    }
    
    }
}
