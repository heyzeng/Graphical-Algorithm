import java.util.Arrays;

/**
 * Author:Jude
 * Date:2021-04-29 下午2:37
 */
public class lc_0169_majorityElement {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        System.out.println(majorityElementMoore(nums));
    }

    // 1 排序、去中间数是最多的
    public static int majorityElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2] ;
    }

    // 2 摩尔投票
    // 理解：多数与少数一对一、剩下就是多数

    public static int majorityElementMoore ( int[] nums) {

        // 初试化
        int mooreValue = nums[0];
        int count = 1; // 投票

        for (int i = 1; i < nums.length; i++) {
            if (mooreValue == nums[i]) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    mooreValue = nums[i + 1];
                }
            }
        }
        // 逻辑
        // return
        return mooreValue;

    }
}

