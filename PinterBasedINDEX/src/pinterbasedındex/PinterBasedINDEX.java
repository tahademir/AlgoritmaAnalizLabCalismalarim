/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinterbasedındex;

import java.util.Scanner;

/**
 *
 * @author taha
 */
public class PinterBasedINDEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        Scanner s = new Scanner(System.in);
        liste.add(2);
        liste.add(12);
        liste.add(43);
        liste.add(23);
        liste.add(65);
        liste.add(7);
        liste.add(72);
        liste.add(21);
        liste.listele();
        System.out.println("----------------------------------");
        System.out.println("kaçıncı indexteki sayıyı bulmak istiyorsunuz ? ");
        int sayi = s.nextInt();
        liste.indexliErisim(sayi);
    }
    
}
