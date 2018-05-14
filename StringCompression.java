
import java.util.*;

public class StringCompression {

    public static String compress(String str) {
        StringBuffer compressed = new StringBuffer();
        int countConsecutive = 0;

        for(int i=0; i<str.length(); i++) {
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {       // if index i is at the last character || if next char is not same to the current one
                compressed.append(str.charAt(i));
                compressed.append( countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }


    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        System.out.println(compress(str1));
    }
}
