package element.hyper;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    static void checkAnaGram(String aFirst, String aSecond) {
        String mFirst = aFirst.toLowerCase().replace(" ", "");
        String mSecond = aSecond.toLowerCase().replace(" ", "");

        char[] aFirstArray = mFirst.toCharArray();
        char[] aSecondArray = mSecond.toCharArray();

        Arrays.sort(aFirstArray);
        Arrays.sort(aSecondArray);

        boolean equals = Arrays.equals(aFirstArray, aSecondArray);
        if (equals) {
            System.out.println("They are anagram");
        } else {
            System.out.println("They are not anagram");
        }

    }
}
