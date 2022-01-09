/**
 * Author:Jude
 * Date:2021-07-19 下午11:06
 */

public class lc_0009_isPalindrome {
    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x !=0)) return false;

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;

    }
}


