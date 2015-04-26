/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author taha
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        QS quick = new QS();
        int dizi[] = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(50) + 1;
        }
        System.out.println("sırasız dizi:");
        for (int i = 0; i < dizi.length; i++) {

            System.out.print(dizi[i] + "-");
        }
        quick.quickSort(dizi, 0, 9);
        System.out.println("");
        System.out.println("Comparation sayısı : " + quick.Comparation);
        System.out.println("swap sayısı : "+ quick.swap);
        System.out.println("sıralı dizi :");
        for (int i = 0; i < dizi.length; i++) {

            System.out.print(dizi[i] + "-");
        }
    }

}
