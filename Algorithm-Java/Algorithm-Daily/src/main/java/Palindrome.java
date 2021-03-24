/**
 * Author:ZJF
 * Date:2021-03-16 下午3:00
 */
public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("a,a,ba,a"));
        System.out.println(isNumAlpha('a'));
        System.out.println(toLowCase('a'));
        System.out.println(isPalindrome2("a,a,ba,a,,,,"));

    }

    // 判断回文字符串
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
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

    /**
     * 自己实现大小写转换，去除数字与字母外的干扰
     */
    public static boolean isPalindrome2(String s) {

        if (null == s && "".equals(s)) return false;

        int i = 0;
        int j = s.length() - 1;
        char a = toLowCase(s.charAt(i));
        char b = toLowCase(s.charAt(j));

        while (i < j) {

            //对除了数字和字母以外的做一个判断
            if (!isNumAlpha(a)) {
                i++;
                continue;
            }

            if (!isNumAlpha(b)) {
                j--;
                continue;
            }

            //对前后做对比
            if (a != b) return false;
            i++;
            j--;

        }

        return true;
    }

    /**
     * 大写转小写
     * a-z：97-122，A-Z：65-90，0-9：48-57。
     * 大写自负和小写自负相差32
     */
    public static char toLowCase(char s) {
        if (s >= 'a' && s <= 'z') return (char) (s - 32);
        return s;
    }

    /**
     * 去除数字与字母外的干扰
     */
    public static boolean isNumAlpha(char s) {

        if (s >= 'a' && s <= 'z') return true;

        if (s >= 'A' && s <= 'Z') return true;

        if (s >= '0' && s <= '9') return true;

        return false;
    }
}
