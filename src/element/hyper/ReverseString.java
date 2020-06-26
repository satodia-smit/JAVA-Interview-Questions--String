package element.hyper;

public class ReverseString {
    static void returnString(String aInput) {

        StringBuilder mStringBuffer = new StringBuilder();

        for (int i = aInput.length() - 1; i >= 0; i--) {
            mStringBuffer.append(aInput.charAt(i));
        }

        System.out.println(mStringBuffer.toString());
    }
}
