/**
 * Author:ZJF
 * Date:2021-03-18 上午11:53
 */

/**
 * KMP算法。求最长公共子序列
 */
public class lc_0028_strStr {
    public static void main(String[] args) {

        System.out.println(strStrViolentMatch("hello", "ll"));
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
            } else {//匹配不到时候、j 回溯
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

    public static int strStrKMP(String str1 ,String str2) {
        return -1;
    }

}
