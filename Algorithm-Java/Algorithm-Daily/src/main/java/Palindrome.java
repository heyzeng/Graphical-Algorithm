/**
 * Author:ZJF
 * Date:2021-03-16 下午3:00
 */
public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("aaabaaa"));

    }
    // 判断回文字符串
    public static boolean isPalindrome(String s ){

        s = s.toLowerCase().replaceAll("[^0-9a-z]","");
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            if (c[i] != c[j]) return false;

                i++;
                j--;
        }
        return true;
    }
}
