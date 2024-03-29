import java.util.Arrays;
import java.util.HashMap;

/*
    LeeCode：两数之和.
 */
public class lc_0001_twoSum {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 8, 10};
        System.out.println(Arrays.toString(twoSum(numbers, 10)));
        System.out.println(Arrays.toString(twoHashMap(numbers, 10)));
        System.out.println(Arrays.toString(doublePointer(numbers, 10)));
    }

    //1 暴力遍历
    public static int[] twoSum(int[] numbers, int target) {

        if (null == numbers) {
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] == target - numbers[i]) {
                    return new int[]{i, j};
                }
            }

        }
        throw new IllegalArgumentException("no have");
    }

    // 双指针解法

    public static int[] doublePointer(int[] numbers, int target) {
        int i = 0; //while 条件
        int j = numbers.length - 1;

        while (i < j) {
            int num = numbers[i] + numbers[j];
            if (target == num) {
                return new int[]{i, j};
            } else if (target < num) { //目标值小于收尾和，则j--
                j--;
            } else { // 反正i++
                i++;
            }
        }
        throw new IllegalArgumentException("no have");
    }

    // 两遍hashmap
    /*
       1、new Hashmap ,把数组塞进去
       2、遍历hashmap

    */
    public static int[] twoHashMap(int[] numbers, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (hashMap.containsKey(complement) && hashMap.get(complement) != i) {
                return new int[]{i, hashMap.get(complement)};
            }
        }
        throw new IllegalArgumentException("no have");
    }
}
