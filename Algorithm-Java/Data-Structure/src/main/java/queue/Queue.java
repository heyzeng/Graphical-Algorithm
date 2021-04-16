package queue;

import java.util.Stack;

/**
 * Author:Jude
 * Date:2021-04-16 上午10:14
 */

/**
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 */
public class Queue {

}

class myQueue {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    /** Initialize your data structure here. */
    public void MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        out2in();
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        out2in();
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    public void out2in() {
        if (out.isEmpty()) {
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
}
