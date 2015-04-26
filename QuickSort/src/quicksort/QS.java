/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author taha
 */
public class QS {

    int q;
    public void quickSort(int A[], int p, int r) {

        if (p < r) {
            q = partition(A, p, r);

            
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    int Comparation = 0, swap = 0;
    public int partition(int A[], int p, int r) {
        int tmp;
        int x = A[r];
        int i = p - 1;
        
        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                i++;
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                swap++;
            }
        }
        tmp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = tmp;
        Comparation += 1;

        return i + 1;
    }
}
