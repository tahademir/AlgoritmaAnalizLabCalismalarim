/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointerbased;

/**
 *
 * @author taha
 */
public class PointerBased {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.listele();
        liste.removeQueue();
        liste.listele();
        liste.removeStack();
        liste.listele();
       
    }
    
}
