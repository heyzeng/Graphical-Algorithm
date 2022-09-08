/**
 * Author:Jude
 * Date:2022-05-08 下午11:35
 */

// 移除重复项
public class lc_0027_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 33, 33,33};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) { // 遍历nums的值
            if (nums[right] != val) {  // 把val目标值移除
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }






}
