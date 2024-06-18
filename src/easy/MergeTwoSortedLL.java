package easy;

public class MergeTwoSortedLL {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        ListNode node4 = new ListNode(10);
        ListNode node5 = new ListNode(20);
        ListNode node6 = new ListNode(30);
        ListNode node7 = new ListNode(40);

        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;

        printNodes(merge(node1,node4));

    }


    static ListNode merge(ListNode head1, ListNode head2) {

        ListNode dummyNode = new ListNode();
        ListNode prev = dummyNode;

        while (head1 != null && head2 != null) {

            if (head1.value <= head2.value) {
                prev.next = head1;
                head1 = head1.next;
            } else {
                prev.next = head2;
                head2 = head2.next;
            }
            prev = prev.next;

        }

        if (head1 == null) {
            prev.next = head2;
        } else {
            prev.next = head1;
        }
        return dummyNode.next;

    }

    static void printNodes(ListNode head){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.value + ", ");
            current = current.next;
        }
        System.out.println();
    }

}
