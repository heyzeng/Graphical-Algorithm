package leecodeEasy;

/**
 * Author:Jude
 * Date:2020-03-10 8:47 AM
 */

public class leecode_01_twoSum {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();//开始时间

        Solution solution = new Solution();
        int[] nums = {1,3,5,9,2,10,7,8,111};//初始化数组
        int[] ints = solution.twoSum(nums, 10);

        //遍历数组
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        long endTime = System.currentTimeMillis();//结束时间
        System.out.println("时长" + (endTime - startTime) + "ms");

    }
}
class Solution{
    public int[] twoSum(int[] nums,int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == target - nums[i]) {

                    return new int[]{i, j};
                }

            }
        }
        throw new IllegalArgumentException("no Two sum solution");

    }
}
