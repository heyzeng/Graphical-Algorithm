/**
 * Author:Jude
 * Date:2020-09-27 3:38 下午
 */

/*
斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……

特别指出：第0项是0，第1项是第一个1。

这个数列从第三项开始，每一项都等于前两项之和。
 */
public class fibonacci {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(FibonacciWithRecursive(10));
        long end = System.currentTimeMillis();
        System.out.println("耗时=" + (end - start));

        long start1 = System.currentTimeMillis();
        System.out.println(FibonacciWithLoop(10));
        long end1 = System.currentTimeMillis();
        System.out.println("耗时=" + (end1 - start1));

    }

    // 时间复杂度 2的n次方
    public static long FibonacciWithRecursive(int n) {
        if (n == 0 || n == 1) return n;

        return FibonacciWithRecursive(n - 1) + FibonacciWithRecursive(n - 2);
    }

    // 时间复杂度 O(n)
    public static long FibonacciWithLoop(int n) {
        if (n == 0 || n == 1) return n;

        int one = 0;
        int two = 1;
        int three = 1;
        for (int i = 2; i < n; i++) {
            one = two;
            two = three;
            three = one + two;
        }
        return three;
    }
    // 小青蛙跳台阶  1 2 3 5 8
}
