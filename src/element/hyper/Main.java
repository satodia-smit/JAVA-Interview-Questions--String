package element.hyper;

public class Main {

    public static void main(String[] args) {
        testLengthOfString();
    }

    static void testReturnString() {
        String mString = "This is me!";
        ReverseString.returnString(mString);
    }

    static void testAnagramString() {
        AnagramString.checkAnaGram("smit", "Mits");
    }

    static void testLengthOfString() {
        LengthOfString.checkLengthOfString("Smit Satodia");
    }
}
