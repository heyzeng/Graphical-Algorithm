import java.util.Arrays;

/**
 * Author:Jude
 * Date:2021-04-28 下午12:17
 */
public class lc_0344_reverseString {
    public static void main(String[] args) {

        char[] chars = {'a','b','c'};

        reverseString(chars);

    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
