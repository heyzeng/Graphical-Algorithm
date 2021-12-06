import java.util.PriorityQueue;

/**
 * Author:Jude
 * Date:2021-12-07 上午12:07
 */
public class lc_0215_findKthLargest {
    public static void main(String[] args) {

        //初始化数组
        int [] numbers = {3,2,1,5,6,4};
        int k = 2;
        int kthLargest = findKthLargest(numbers, k);
        System.out.println(kthLargest);

    }
    public static int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k);//维持最小堆
            pq.poll();
        }
        return pq.peek();

    }
}
