import java.sql.SQLOutput;
import java.util.HashMap;

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
        System.out.println("-----------------------");

        //双指针
        DoublePointer doublepointer = new DoublePointer();
        int[] twoSum1 = doublepointer.twoSum(numbers, 10);
        //遍历
        for (int i = 0; i < twoSum1.length; i++) {
            System.out.println(twoSum1[i]);
        }

        System.out.println("-----------------------");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(i,numbers[i]);

        }
        System.out.println(hashMap.get(1));

        System.out.println("-----------------------");

        //hashmap
        twoHashMap twoHashMap = new twoHashMap();
        int[] two = twoHashMap.twoSum(numbers, 10);
        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);

        }

        //遍历

    }


}

//暴力遍历
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

// 双指针解法
class DoublePointer {
    public int[] twoSum(int[] numbers,int target){

        if (numbers == null) {return null;}

        int i = 0;
        int j = numbers.length -1;

        while (i < j){
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                return new int[]{i ,j};
            }else if (sum < target){
                i++;
            }else{
                j--;
            }
        }

        return null;
    }

}
// 两边hashmap
/*
  1、new Hashmap ,把数组塞进去
  2、遍历hashmap
 */
class twoHashMap{
    public int[] twoSum(int[] numbers,int target){

        //1、new Hashmap ,把数组塞进去
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(numbers[i],i);
        }

        //2、遍历hashmap,求target
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (hashMap.containsKey(complement) && hashMap.get(complement) != i){
                return new int[]{i , hashMap.get(complement)};
            }

        }
        throw new IllegalArgumentException("no hava");
    }
}