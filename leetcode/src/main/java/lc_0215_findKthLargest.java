import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Author:Jude
 * Date:2020-08-27 10:56 上午
 */
public class lc_0215_findKthLargest {
    public static void main(String[] args) {
        findKthLargestSolution findKthLargestSolution = new findKthLargestSolution();

        //初始化数组
        int [] numbers = {3,2,1,5,6,4};
        int kthLargest = findKthLargestSolution.findKthLargest(numbers, 2);
        System.out.println(kthLargest);
    }

}

// 方法一  排序 ：时间复杂度 O(NlogN)，空间复杂度 O(1)
class findKthLargestSolution{
    public int findKthLargest(int[] numbers,int k){

        Arrays.sort(numbers);
        return numbers[numbers.length -k];

    }
}
// 方法二 堆排序