import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author:Jude
 * Date:2021-04-15 下午8:35
 */
public class lc_0160_getIntersectionNode {
    public static void main(String[] args) {

        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);

        List<Object> arrayList = new ArrayList<>();
        arrayList.add(h1);
        arrayList.add(h2);
        arrayList.add(h3);


        ListNode h4 = new ListNode(2);
        ListNode h5 = new ListNode(3);
        ListNode h6 = new ListNode(4);

        List<Object> arrayList1 = new ArrayList<>();
        arrayList1.add(h4);
        arrayList1.add(h5);
        arrayList1.add(h6);

        System.out.println(getIntersectionNode(h4,h2));


    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        Set<ListNode> listNodes = new HashSet<>();

        ListNode curNode = headA;
        while (curNode != null){
            listNodes.add(curNode);
            curNode = curNode.next;
        }

        curNode = headB;
        while (curNode != null) {
            if (listNodes.contains(curNode)) {
                return curNode;
            }

            curNode = curNode.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next; // 下一个链表对象
        ListNode (int x ){val = x;}; //赋值链表的值

    }
}
