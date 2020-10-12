package element.hyper.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Link: https://www.youtube.com/watch?v=ETHXH0Ri2PE

public class DuplicateWordsString {
    public static void main(String[] args) {
        String mInputStr = "Smit is not only good , Smit is very Good ";
        String mUniformStr = mInputStr.toLowerCase();

        String[] mArr = mUniformStr.split(" ");

        Map<String, Integer> mapString = new LinkedHashMap<>();

        for (String aStr :
                mArr
        ) {
            if (mapString.containsKey(aStr)) {
                // Having key in the array
                mapString.put(aStr, mapString.get(aStr) + 1);
            } else {
                mapString.put(aStr, 1);
                //Not having key in the array
            }
        }


        mapString.forEach((key, value) -> {
            System.out.println("Word " + key + " used " + value);
        });
    }
}
