## 递归的概念
简单的说: 递归就是方法自己调用自己,每次调用时传入不同的变量.递归有助于编程者解决复杂的问题,同时可以让代码变得简洁。
## 递归调用机制
列举两个小案例,来理解递归, 说明递归调用机制
- 打印问题
- 阶乘问题
### 打印问题
- 代码
```java
class Solution{
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
class Solution{
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
- 递归必须向退出递归的条件逼近，否则就是无限递归,出现`StackOverflowError`)
- 当一个方法执行完毕，或者遇到`return，就会返回，遵守谁调用，就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕
## 递归能解决什么样的问题
- 各种数学问题如: 八皇后问题 , 汉诺塔, 阶乘问题, 迷宫问题, 球和篮子的问题(google编程大赛)
- 各种算法中也会使用到递归，比如快排，归并排序，二分查找，分治算法等.
- 将用栈解决的问题-->第归代码比较简洁
## 递归经典题
### 题1：斐波那契数
>请使用递归的方式，求出斐波那契数`0,1,1,2,3,5,8,13`...给你一个整数`n`，求出它的斐波那契数是多少？
```java
class Solution{
   public static long FibonacciWithRecursive(int n) {
        if (n == 0 || n == 1) return n;
        if (n > 1)
        return FibonacciWithRecursive(n - 1) + FibonacciWithRecursive(n - 2);
    }
}
```
### 题2：求函数值
>已知 `f(1)=3; f(n) = 2*f(n-1)+1 `请使用递归的思想编程，求出 `f(n)`的值?

```java
class Solution{
    public static int Function(int n){
        if (n == 1) return 3;
        if (n > 1)
        return 2 * Function(n-1) + 1;
}
}
```
### 题3：猴子吃桃子问题
>有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
```java
class Solution{
public static int monkeyEatPeach(int Day) {
        if (Day <= 0) {
            System.out.println("时间不能小于 0");
        }

        if (Day == 10) {
            return 1;
        } else {
            return 2 * (monkeyEatPeach(Day + 1) + 1);
        }
    }}
```
### 题4：二分查找
>数组是有序的、请使用递归方式的二分查找法，完成查找 `binarySearch`
```java
class Solution{
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
    }}
```
### 题5：汉诺塔
```java
class Solution{
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
        }}}
```
## 递归的优化
>对于递归的问题，一般来说是自上而下递归的，知道递归到最低层，在一层层的把值返回。

>当`n`的取值非常大的时候，比如`n = 5000`时，那么递归要想下递归5000层之后，到`n<=1`时，才把结果一层层返回。如果`n`取值过大，可能导致栈的空间不够用。
>可以考虑用`for`循环做累加
```java
class Solution{
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
}
```

### 时间复杂度对比
- 递归的常用复杂度分析

| 递归关系 | 结果 | 举例 |
| ---- | ---- | ---- |
|T(n) = T(n/2) + O(1)|T(n) = O(logn)|二分查找、欧几里得|
|T(n) = T(n - 1) + O(1)|T(n) = O(n)|线性查找|
|T(n) = 2T(n/2) + O(n)|T(n) = O(nlogn)|归并、快排|
|T(n) = T(n - 1) + O(n)|T(n) = O(n*n)|选择排序、插入排序|
|T(n) = 2T(n -1 ) + O(1)|T(n) = O(2^n)|汉诺塔|
|T(n) = T(n -1 ) + T(n -2 ) O(1)|T(n) = O(2^n)|递归的斐波那契|

- 优化后的`for`循环复杂度对比
>优化后`for`时间复杂为`O(n)`,是小于O(2^n)
