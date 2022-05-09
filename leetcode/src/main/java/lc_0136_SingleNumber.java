/**
 * Author:Jude
 * Date:2022-05-09 下午10:49
 */
public class lc_0136_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,5};
        System.out.println(singleNumber(nums));
    }

   //异或
    public static int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;

    }
}
