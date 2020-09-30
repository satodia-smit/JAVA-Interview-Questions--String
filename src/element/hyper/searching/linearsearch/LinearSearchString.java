package element.hyper.searching.linearsearch;

//Link: https://www.youtube.com/watch?v=iGnrCiHPOCg&t=787s
public class LinearSearchString {

    public static void main(String[] args) {
        String[] array = {"Usa", "India", "Japan"};
        String searchItem = "India";
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchItem)) {
                System.out.println("Searched item " + searchItem + " found at " + i + "th position");
                temp = 1;
            }
        }

        if (temp == 0) {
            System.out.println("Unable to find");
        }
    }
}
