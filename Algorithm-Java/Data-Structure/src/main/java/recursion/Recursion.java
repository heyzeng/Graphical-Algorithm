package recursion;


public class Recursion {
    public static void main(String[] args) {
        test1(5);
        System.out.println(factorial(3));
    }

    // 递归 输出 2 3 4 5
    public static void test1(int n) {
        if (n > 2) {
            test1(n - 1);
        }
        System.out.println("n = " + n);
    }

    // 阶乘
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

}


