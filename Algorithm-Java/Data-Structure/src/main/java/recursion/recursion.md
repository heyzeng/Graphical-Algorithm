## 递归的概念
简单的说: 递归就是方法自己调用自己,每次调用时传入不同的变量.递归有助于编程者解决复杂的问题,同时可以让代码变得简洁。
## 递归调用机制
列举两个小案例,来理解递归, 说明递归调用机制
- 打印问题
- 阶乘问题
### 打印问题
- 代码
```java
class solution{
public static void test(int n) {
    if (n > 2) {
	    test(n - 1);
}
    System.out.println("n=" + n);
    }
}
```
- 结果
```
test(4)
2 3 4 
```
### 阶乘问题
- 代码
```java
class solution{
public static int factorial(int n) {
    if (n == 1) { //n=1
    return 1;
    } else {
    return factorial(n - 1) * n; //简洁
}}
}
```
- 结果示例
```
n = 5
=> 5 * f(4)
=> 5 * (4 * f(3))
=> 5 * (4 * (3 * f(2)))
=> 5 * (4 * (3 * (2 * f(1))))
=> 5 * (4 * (3 * (2 * (1))))
=> 5 * (4 * (3 * (2 * 1)))
=> 5 * (4 * (3 * (2)))
=> 5 * (4 * (6))
=> 5 * (24)
=> 120
```
## 递归需要遵守的重要规则
- 执行一个方法时，就创建一个新的受保护的独立空间(栈空间)
- 方法的局部变量是独立的，不会相互影响, 比如n变量
- 如果方法中使用的是引用类型变量(比如数组)，就会共享该引用类型的数据.
- 递归必须向退出递归的条件逼近，否则就是无限递归,出现StackOverflowError)
- 当一个方法执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕
## 递归能解决什么样的问题
- 各种数学问题如: 八皇后问题 , 汉诺塔, 阶乘问题, 迷宫问题, 球和篮子的问题(google编程大赛)
- 各种算法中也会使用到递归，比如快排，归并排序，二分查找，分治算法等.
- 将用栈解决的问题-->第归代码比较简洁
# 经典题
## 题1：斐波那契数
> 请使用递归的方式，求出斐波那契数0,1,1,2,3,5,8,13...给你一个整数n，求出它的斐波那契数是多少？
```java
class Solution{
   public static long FibonacciWithRecursive(int n) {
        if (n == 0 || n == 1) return n;
        if (n > 1)
        return FibonacciWithRecursive(n - 1) + FibonacciWithRecursive(n - 2);
    }
}
```
## 题2：求函数值
>已知 f(1)=3; f(n) = 2*f(n-1)+1 请使用递归的思想编程，求出 f(n)的值?
```java
class Solution{
    public static int Function(int n){
        if (n == 1) return 3;
        if (n > 1)
        return 2 * Function(n-1) + 1;
}
}
```

