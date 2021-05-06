import java.util.Arrays;

/**
 * Author:Jude
 * Date:2021-05-06 下午12:16
 */


/**
 * 异或运算具有如下性质：
 *
 * 异或运算满足交换律和结合律；
 *
 * 任意整数和自身做异或运算的结果都等于 0，即 x ^ x = 0；
 *
 * 任意整数和 0 做异或运算的结果都等于其自身，即 x ^ 0 = 0 ^ x = x。
 *
 */

public class lc_1720_decode {

    public static void main(String[] args) {

        int[] encode = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decode(encode, first)));
    }

    public static int[] decode(int[] encoded, int first) {

        int n = encoded.length + 1;
        int[] ans = new int[n];
        ans[0] = first;

        for (int i = 1; i < n; i++) {
            ans[i] = encoded[i - 1]^ans[i - 1];
        }
        return ans;
    }
}
