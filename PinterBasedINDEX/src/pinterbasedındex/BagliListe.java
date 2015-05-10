/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinterbasedındex;

/**
 *
 * @author taha
 */
public class BagliListe {

    static Node head, tail;

    public void add(int sayi) {
        Node yeninode = new Node(sayi);
        if (head == null) {
            head = yeninode;
            tail = yeninode;
        } else {
            tail.Sonraki = yeninode;
            tail = yeninode;
        }
    }

    public void removeQueue() {
        Node temp, önceki;
        temp = head;
        if (temp == null) {
            System.out.println("bağlı liste boş");
        } else {
            System.out.println("çıkarılan sayı(kuyruk) :" + head.data);
            head = head.Sonraki;
        }

    }

    public void removeStack() {
        Node temp, onceki;
        temp = head;
        onceki = temp;

        if (temp == null) {
            System.out.println("bağlı liste boş");
        } else {
            temp = temp.Sonraki;
            while (temp.Sonraki != null) {
                onceki = temp;
                temp = temp.Sonraki;
            }
            System.out.println("çıkarılan sayı(yığın) :" + temp.data);
            tail = onceki;
            tail.Sonraki = null;

        }
    }

    public void listele() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");

            temp = temp.Sonraki;

        }
        System.out.println("");
    }

    public void bul(int sayi) {
        Node temp = head;
        while (temp.Sonraki != null) {
            if (temp.data == sayi) {
                System.out.println("Aranan sayi bağlı listede mevcut.");
                System.out.println("Aranan sayi =" + temp.data);
            }
            temp = temp.Sonraki;
        }
        System.out.println("Aranan sayı listede yok");
    }

    public void indexliErisim(int indexSayisi) {
        Node temp = head;
        int i = 1;
        while (temp.Sonraki != null) {

            if (i == indexSayisi) {
                System.out.println("Aranan indexteki sayi = " + temp.data);
                break;
            }
            i++;
            temp = temp.Sonraki;
            if (temp.Sonraki == null) {
                System.out.println("Bağlı liste uzunluğunu aşan bir index girdiniz !");
            }
        }
    }
}
