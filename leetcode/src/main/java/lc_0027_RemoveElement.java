/**
 * Author:Jude
 * Date:2022-05-08 下午11:35
 */
public class lc_0027_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 33, 33,33};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int n = 0;
        for (int num : nums) {
            if (val != num) {
                nums[n] = num;
                n++;
            }
        }
        return n;
    }
}
