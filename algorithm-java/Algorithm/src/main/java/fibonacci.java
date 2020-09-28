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

    public  static long fibonacii_test(long n){

        //递归思想
        if (n == 0 || n == 1 ){
            return n;
        }else{
           return fibonacii_test(n-1) + fibonacii_test(n-2);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i <=100; i++) {
            System.out.printf("Fibonacii of %d is : %d\n",i,fibonacii_test(i));

        }
    }
}
