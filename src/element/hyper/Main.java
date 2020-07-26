package element.hyper;

public class Main {

    public static void main(String[] args) {
        testCopyString();
    }

    static void testReturnString() {
        String mString = "This is me!";
        ReverseString1.returnString(mString);
    }

    static void testAnagramString() {
        AnagramString.checkAnaGram("smit", "Mits");
    }

    static void testLengthOfString() {
        LengthOfString.checkLengthOfString("Smit Satodia");
    }

    static void testCopyString() {
        CopyString.copyString("Smit Satodia");
    }
}
