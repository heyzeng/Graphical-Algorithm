/**
 * Author:Jude
 * Date:2022-05-12 上午12:25
 */
public class TestSearch {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        //优化 left + right 可能会溢出
//         int mid = (left + right) / 2;
        int mid = left + (left - right) / 2;

        while (right > left) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                mid--;
            } else {
                mid++;
            }
        }
        return -1;
    }
}
