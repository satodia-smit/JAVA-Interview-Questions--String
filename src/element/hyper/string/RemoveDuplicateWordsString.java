package element.hyper.string;

import java.io.BufferedReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsString {

    public static void main(String[] args) {
        String mInputStr = "aabbccdfddd";

        char[] mInputCharArr = mInputStr.toCharArray();

        Set<Character> mSet = new LinkedHashSet<Character>();
        for (Character aChar : mInputCharArr) {
            mSet.add(aChar);
        }


        StringBuffer mStrBuffer = new StringBuffer();
        for (Character aChar : mSet) {
            mStrBuffer.append(aChar);
        }

        System.out.println(mStrBuffer.toString());
    }
}
