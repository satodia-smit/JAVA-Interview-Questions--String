package element.hyper.sorting.selectionsort;

//Link: https://www.youtube.com/watch?v=GRNOoZeV6xc&t=1039s

public class SelectionSortStringArray {
    public static void main(String[] args) {
        String[] array = {"Amit","Smit", "Usha", "Suresh","Zarna"};
        int min;
        String temp = "";

        for (int i = 0; i < array.length; i++) {

            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
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
