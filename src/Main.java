import java.util.Arrays;

public class Main {

    static String[] stringArray = {"This", "is", "my", "first", "javaCode"};
    static String word1 = "project";

    public static void main(String[] args) {
        int multipliedResult = mult(4, 8);
        System.out.println("the multiplied result is " + multipliedResult);

        concatTypes("Età: ", 28);

        String[] newArray = insertWordinArray(stringArray, word1);
        System.out.println(Arrays.toString(newArray));
    }

    public static int mult(int num1, int num2) {
        return num1 * num2;
    }

    public static void concatTypes(String word, int num) {
        System.out.println((word + num));
    }

    public static String[] insertWordinArray(String[] stringArray, String word1) {
        String[] newArray = new String[6];
        System.arraycopy(stringArray, 0, newArray, 0, 2);
        newArray[2] = word1;
        newArray[3] = stringArray[3];
        newArray[4] = stringArray[4];
        newArray[5] = "";
        return newArray;
    }
}
