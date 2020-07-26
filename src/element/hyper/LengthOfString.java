package element.hyper;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class LengthOfString {

    public static void checkLengthOfString(String s) {
        s = s.concat("\0");
        char[] characterArray = s.toCharArray();
        int count = 0;

        while (characterArray[count] != '\0') {
            count++;
        }

        System.out.println("Size of the String is " + count);

    }
}
