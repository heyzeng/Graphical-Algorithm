package leecodeEasy;

/**
 * Author:Jude
 * Date:2020-03-10 8:47 AM
 */
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
