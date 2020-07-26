package element.hyper;

public class CopyString {
    public static void copyString(String s) {

        //To check the size
        String input = s.concat("\0");

        // To calculate Size
        char[] inputArray = input.toCharArray();
        int inputLength = 0;
        while (inputArray[inputLength] != '\0') {
            inputLength++;
        }

        // Create new array for output
        char[] outputArray = new char[inputLength];
        int i = 0;
        while (i != inputLength) {
            outputArray[i] = inputArray[i];
            i++;
        }

        //Output the value
        System.out.println(outputArray);
    }
}