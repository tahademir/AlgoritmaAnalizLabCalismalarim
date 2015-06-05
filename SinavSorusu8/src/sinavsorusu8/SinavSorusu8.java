/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinavsorusu8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author taha
 */
public class SinavSorusu8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uzunluk = 0;
        Random rnd = new Random();
        System.out.println("Dizinin uzunluğunu giriniz :");
        Scanner girilenSayi = new Scanner(System.in);      // Dizinin uzunlugunu kullanıcıdan alıyoruz
        uzunluk = girilenSayi.nextInt();    // Alınan uzunluk değişkene aktırılıyor
        int dizi[] = new int[uzunluk];    // Dizinin boyutunu kullanıcının istediği boyuta göre tanımlıyoruz
        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50) + 1;
        }
        System.out.println("ilk oluşturulan dizi :");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
        for(int i = 0 ; i < dizi.length/2 ; i++)
        {
            int temp = dizi[i];
            dizi[i] = dizi[dizi.length-i-1];
            dizi[dizi.length-i-1]=temp;
        }
        System.out.println("");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
    }

}
