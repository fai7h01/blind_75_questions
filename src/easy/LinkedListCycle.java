package easy;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    static boolean hasCycle(ListNode head){

        Set<ListNode> set = new HashSet<>();

        ListNode current = head;

        while(current != null){
            if (!set.add(current)) return true;
            current = current.next;
        }
        return false;

    }

    static boolean hasCycle2(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }

        return false;


    }

}
