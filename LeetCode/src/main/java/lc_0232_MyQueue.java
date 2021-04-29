import java.util.Stack;

/**
 * Author:Jude
 * Date:2021-04-29 下午3:25
 */
public class lc_0232_MyQueue {

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
