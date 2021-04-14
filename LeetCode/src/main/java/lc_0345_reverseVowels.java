/**
 * Author:Jude
 * Date:2021-04-13 下午7:04
 */

import java.util.Arrays;
import java.util.HashSet;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * input "hello"
 * output "holle"
 */
public class lc_0345_reverseVowels {

    public static final HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {

        String s = "hello";
        String s1 = reverseVowels(s);
        System.out.println(s1);
    }

    public static String reverseVowels(String s) {

        if (null == s) return null;
        char[] result = new char[s.length()];

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {

            char ci = s.charAt(i);
            char cj = s.charAt(j);

            if (!vowels.contains(ci)) {
                result[i] = ci;
                i++;
            } else if (!vowels.contains(cj)) {
                result[j] = cj;
                j--;
            } else {
                result[i] = cj;
                i++;
                result[j] = ci;
                j--;
            }
        }
        return new String(result);
    }

}
