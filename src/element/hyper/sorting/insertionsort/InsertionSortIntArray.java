package element.hyper.sorting.insertionsort;

// Link: https://www.youtube.com/watch?v=yCxV0kBpA6M&t=19s
public class InsertionSortIntArray {
    public static void main(String[] args) {

        int[] a = {10, 2, 4, 1, 5, 3, 33};

        for (int i = 1; i < a.length; i++) {

            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }

        for (int value : a) {
            System.out.println(value);
        }
    }
}
