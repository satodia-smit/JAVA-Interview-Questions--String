package element.hyper.string;

// Link: https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
public class Palindrome1 {
    public static void main(String[] args) {
        String mInput = "01233210";
        char[] mInputCharArray = mInput.toCharArray();
        int mStartPointer = 0;
        int mEndPointer = mInput.length() - 1;

        while (mStartPointer < mEndPointer) {
            if (mInputCharArray[mStartPointer] != mInputCharArray[mEndPointer]) {
                System.out.println("String is not palindrome");
                return;
            }
            mStartPointer++;
            mEndPointer--;
        }

        System.out.println("String is palindrome");
    }
}
