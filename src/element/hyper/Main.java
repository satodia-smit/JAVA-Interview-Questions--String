package element.hyper;

public class Main {

    public static void main(String[] args) {
        testAnagramString();
    }

    static void testReturnString() {
        String mString = "This is me!";
        ReverseString.returnString(mString);
    }

    static void testAnagramString(){
        AnagramString.checkAnaGram("smit","Mits");
    }
}
