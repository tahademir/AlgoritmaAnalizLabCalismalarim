/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author taha
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST_Islemler bst = new BST_Islemler();
        Random rnd = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Kaç Node' lu Bir Ağaç Oluşturmak İstersiniz :");
        int node = s.nextInt();
        for (int i = 0; i < node; i++) {
            bst.insert(rnd.nextInt(1000000) + 1);
        }
        System.out.println("arama sayısını giriniz : ");
        int arama = s.nextInt();
        int gezilenNode = 0;
        for (int i = 0; i < arama; i++) {
            gezilenNode = gezilenNode + bst.sayarakArama(bst.root,rnd.nextInt(2147483647));
        }
        System.out.println("Gezinti Ortalaması :");
        System.out.println(bst.aramaSayisi/arama);
    }
    
}
