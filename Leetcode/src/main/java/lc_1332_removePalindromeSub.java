/**
 * Author:Jude
 * Date:2021-04-26 上午11:40
 */
public class lc_1332_removePalindromeSub {
    public static void main(String[] args) {
        String s = "";

        System.out.println(removePalindromeSub(s));

    }
    public static int removePalindromeSub(String s) {

        if("".equals(s)) return 0;

        if (s.equals(new StringBuffer(s).reverse().toString())) return 1;

        return 2;
    }
}


