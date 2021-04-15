package recursion;


public class Recursion {
    private static int step = 0;
    public static void main(String[] args) {

        test1(5);

        System.out.println(factorial(3));

        System.out.println(FibonacciWithRecursive(10));

        System.out.println(Function(4));

        System.out.println(monkeyEatPeach(1));

        // test binarySearch
        int[] arr = {1,2,4,5,66};
        System.out.println(binarySearch(arr,0,arr.length - 1,66,(arr.length - 1) /2 ));

        // 汉诺塔测试
        HanoiTower(5,'a','b','c');
    }


    // 1 递归 输出 2 3 4 5
    public static void test1(int n) {
        if (n > 2) {
            test1(n - 1);
        }
        System.out.println("n = " + n);
    }


    // 2 阶乘
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }


    // 3 斐波那契 0,1,1,2,3,5....
    public static int FibonacciWithRecursive(int n) {

        if (n == 0 || n == 1) return n;
        return FibonacciWithRecursive(n - 1) + FibonacciWithRecursive(n - 2);
    }


    // 4 小青蛙跳台阶 1 2 3 5
    public static int Frog(int n) {
        if (n == 1 || n == 2) return n;
        return Frog(n - 1) + Frog(n - 2);
    }


    // 5 求函数值

    /**
     * 已知 f(1)=3; f(n) = 2*f(n-1)+1;   请使用递归的思想编程，求出 f(n)的值?
     */
    public static int Function(int n) {
        if (n == 1) return 3;

        return 2 * Function(n - 1) + 1;
    }


    // 6 猴子吃桃子问题

    /**
     * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半
     * ，然后再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1个桃子了。
     * 问题：最初共多少个桃子？
     * <p>
     * 思路分析
     * 第十天  1
     * 第九天  (1+1) * 2 = 4
     * 8  (4 +1) * 2 = 10
     * 7 (10 + 1) * 2 = 22
     */
    public static int monkeyEatPeach(int Day) {
        if (Day <= 0) {
            System.out.println("时间不能小于 0");
        }

        if (Day == 10) {
            return 1;
        } else {
            return 2 * (monkeyEatPeach(Day + 1) + 1);
        }
    }


    // 7 binarySearch

    /**
     *
     * @param arr 有序数组
     * @param left 左下标
     * @param right 右下标
     * @param findNum 查找的数
     * @param midNum 中间的数
     * @return 返回下标
     *
     * 思路
     * 		1. 先分析 给的数组的顺序 小->大
     * 		2. 先找到中间的下标  mid = (left + right) / 2
     * 		3. 让中间下标对应的值和 findNum 比较
     * 		3.1 如果 arr[mid] == findNum 找到 return mid
     * 		3.2 如果 arr[mid] > findNum 向左递归查找
     * 		3.3 如果 arr[mid] < findNum 向右递归查找
     * 		4. 当 left > right 不能比较，说明找不到，返回 -1
     */

    public static int binarySearch(int[] arr,int left, int right, int findNum,int midNum) {
        if (right < left) return -1;
        midNum = (left + right) / 2;

        if (findNum == arr[midNum]) {
            return (left + right) / 2;
        } else if (findNum > arr[midNum]){
            return binarySearch(arr, midNum + 1, right, findNum, midNum);
        } else {
            return binarySearch(arr, left, midNum  - 1, findNum, midNum);
        }
    }

    // 8 汉诺塔
    //思路
    //1. 当只有一个盘的时候，就是 'A' -> 'C'
    //2. 如果有多个盘 n，我们可以看成两个盘 上面的所有盘(n-1) 和 最下的一个盘(n)
    //2.1 先把 上面的所有盘(n-1) 移动到 A ->  B塔
    //2.2 把 最下的一个盘(n) 从 A->C
    //2.3 把  所有盘(n-1) B->C

    public static void HanoiTower(int n,char a, char b, char c) {

        if (n == 1) {
            System.out.println( ++ step +"步数"+ a + "->" + c);
        }else {
            // a b c  借助c 把 n-1 的盘子放到b
            HanoiTower(n-1,a,c,b);
            // 把 a -> c 把 最后一个盘子放到 c
            System.out.println(++step +"步数"+ a + "->" + c);
            // a b c  借助b 把 n-1 的盘子放到c
            HanoiTower(n-1,b,a,c);
        }
    }
}


