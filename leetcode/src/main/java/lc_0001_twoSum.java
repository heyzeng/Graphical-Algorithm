


/*
    LeetCode：两数之和
 */
public class lc_0001_twoSum {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //初始化数组
        int[] numbers = {1,10,9,210};
        int[] twoSum = solution.twoSum(numbers, 10);

        //遍历
        for (int i = 0; i < twoSum.length; i++) {
            System.out.println(twoSum[i]);
        }

    }


}

class Solution{
    public int[] twoSum(int[] numbers,int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] == target - numbers[i]){
                    return new int[]{i,j};
                }
            }

        }
        throw new IllegalArgumentException("no have");
    }
}
