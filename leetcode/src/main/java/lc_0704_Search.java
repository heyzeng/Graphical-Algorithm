/**
 * Author:Jude
 * Date:2022-05-12 上午12:07
 */
public class lc_0704_Search {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4};
        int target = 4;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        //优化 left + right 可能会溢出
//         int mid = (left + right) / 2;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
