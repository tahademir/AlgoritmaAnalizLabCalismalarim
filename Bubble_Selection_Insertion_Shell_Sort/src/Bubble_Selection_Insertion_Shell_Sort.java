import java.util.Random;


public class Bubble_Selection_Insertion_Shell_Sort {

	public static void main(String[] args) {
        Random rand = new Random();
        int dizi[] = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(50) + 1;
        }
        int[] dizi1 = dizi.clone();
        int[] dizi2 = dizi.clone();
        int[] dizi3 = dizi.clone();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "-");
        }
        System.out.println("");
        BubbleSort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "-");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        SelectionSort(dizi1);
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i] + "-");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        InsertionSort(dizi2);
        for (int i = 0; i < dizi2.length; i++) {
            System.out.print(dizi2[i] + "-");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        shell(dizi3);
        for (int i = 0; i < dizi3.length; i++) {
            System.out.print(dizi3[i] + "-");
        }
    }

    public static void BubbleSort(int[] dizi) {
        int swap = 0, comparison = 0;

        int temp;   // Yer değiştirmede kullanılacak geçici değişken
        for (int i = 1; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length - i; j++) {
                comparison++;
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                    swap++;
                }//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
            }
            // Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
        }
        System.out.println("Bunnle Sort Sawp :" + swap);
        System.out.println("Bunnle Sort Comparison :" + comparison);
        // Her karşılaştırmadan sonra yeniden kaldığımız yerden devam etmemizi sağlayan döngü
    }

    public static void SelectionSort(int[] dizi) {
        int yedek;
        int minIndex;
        int swap = 0, comparison = 0;
        for (int i = 0; i < dizi.length - 1; i++) {
            minIndex = i;
            for (int j = i; j < dizi.length; j++) {
                comparison++;
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }
            yedek = dizi[i];
            dizi[i] = dizi[minIndex];
            dizi[minIndex] = yedek;
            swap++;
        }
        System.out.println("Selection Sort Sawp :" + swap);
        System.out.println("Selection Sort Comparison :" + comparison);
    }

    public static void InsertionSort(int[] dizi) {
        int swap = 0, comparison = 0;
        int n = dizi.length;
        for (int j = 1; j < n; j++) {
            int key = dizi[j];
            int i = j - 1;
            while ((i > -1) && (dizi[i] > key)) {
                dizi[i + 1] = dizi[i];
                i--;
                swap++;
                comparison++;
            }
            dizi[i + 1] = key;
            comparison++;
        }

        System.out.println("Insertion Sort Sawp :" + swap);
        System.out.println("Insertion Sort Comparison :" + comparison);

    }

    public static void shell(int[] a) {
        int comparison = 0;
        int swap = 0;
        for (int gap = a.length / 2; gap > 0;
                gap = gap == 2 ? 1 : (int) (gap / 2.2)) {
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                int j = i;

                for (; j >= gap && tmp < a[j - gap]; j -= gap) {
                    a[j] = a[j - gap];
                    swap++;
                    comparison++;
                }
                a[j] = (int) tmp;
                comparison++;
            }
        }
        System.out.println(" Shell Sort swap : " + swap);
        System.out.println(" Shell Sort Comparison : " + comparison);
    }
}
