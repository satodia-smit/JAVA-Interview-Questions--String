package element.hyper.sorting.selectionsort;

//Link: https://www.youtube.com/watch?v=GRNOoZeV6xc&t=1039s

public class SelectionSortIntArray {
    public static void main(String[] args) {
        int[] array = {38, 52, 9, 18, 6, 62, 13,0, -1};
        int min, temp = 0;

        for (int i = 0; i < array.length; i++) {

            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
