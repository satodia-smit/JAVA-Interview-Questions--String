package element.hyper.searching.linearsearch;


//Link: https://www.youtube.com/watch?v=iGnrCiHPOCg&t=787s

public class LinearSearchInt {

    public static void main(String[] args) {
        int[] array = {0, 56, 12, 45, 8, 6, 4, 64, 8};
        int searchItem = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchItem) {
                System.out.println("Searched item " + searchItem + " found at " + i + "th position");
                temp = 1;
            }
        }

        if(temp == 0){
            System.out.println("Unable to find");
        }
    }
}
