/**
 * Author:ZJF
 * Date:2021-03-18 上午11:53
 */

import java.util.Arrays;

/**
 * KMP算法。求最长公共子序列
 */
public class lc_0028_strStr {
    public static void main(String[] args) {

        System.out.println(strStrViolentMatch("hello", "ll"));
        System.out.println(Arrays.toString(kmpNext("aabaa")));

        System.out.println(strStrKMP("hello", "ll"));
        System.out.println(strStrKMP2("hello", "ll"));
    }

    // 1 暴力匹配方法
    public static int strStrViolentMatch(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {//匹配不越界

            if (a[i] == b[j]) {//匹配到
                i++;
                j++;
            } else {//匹配不到时候、 j 回溯
                i = i - j + 1;
                j = 0;
            }
        }

        if ((i - j) == b.length) {//匹配成功
            return i - j;
        } else {
            return -1;
        }
    }

    // 2 KMP算法
    public static int strStrKMP(String str1, String str2) {
        if ("".equals(str2)) {
            return 0;
        }

        int[] next = new int[str2.length()];
        for (int i = 0, j = 0; i < str1.length(); i++) {
            //需要处理 str1.charAt(i) != str2.charAt(j), 去调整 j 的大小
            //KMP 算法核心点
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }

            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {//找到了 // j = 3 i
                return i - j + 1;
            }
        }
        return -1;
    }


    // 直接用next数组
    public static int strStrKMP2(String str1, String str2) {
        if ("".equals(str2)) {
            return 0;
        }

        int[] next = kmpNext(str2);

        int j = 0;
        for (int i = 0; i < str1.length(); i++) {
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }

            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                return i - str2.length() + 1;
            }
        }
        return -1;
    }

    public static int[] kmpNext(String dest) {

        //初试化
        int[] next = new int[dest.length()];
        next[0] = 0;

        int j = 0;
        //j是前缀， i后缀，j > 0防止数组回退越界
        for (int i = 1; i < dest.length(); i++) {
            if (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1]; //j 向前回退一位
            }

            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
