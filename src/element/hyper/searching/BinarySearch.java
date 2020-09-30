package element.hyper.searching;
//Link: https://www.youtube.com/watch?v=7iE5xNOJET0

// In binary search array must be sorted at first place using any sorting technique
public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};

        int search = 24;

        int li = 0;
        int hi = array.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi) {
            if (array[mi] == search) {
                System.out.println("Element is at " + mi + " index position");
                break;
            } else if (array[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > mi) {
            System.out.println("Element not found");
        }
    }
}
