/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinavsorusu6;

/**
 *
 * @author taha
 */
public class SinavSorusu6 {

    /**
     * @param args the command line arguments
     */
    static int maxSifirSayisi = 0;
    static int maxSifirSayisiEncok = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0};

        maxSubSum2(a);

    }

    public static void maxSubSum2(int[] a) {
        maxSifirSayisi = 0;
        maxSifirSayisiEncok = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {

                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 0) {
                        maxSifirSayisi++;
                    }
                    if (a[j] == 1) {
                        maxSifirSayisi = 0;
                    }
                    if (maxSifirSayisi > maxSifirSayisiEncok) {
                        maxSifirSayisiEncok = maxSifirSayisi;
                    }
                }
            }

        }
        System.out.println("maxSıfırSayısıEncok : " + maxSifirSayisiEncok);

    }

}
