public class LinkedListCycleDetector {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;  // Cycle: 4 -> 2

        LinkedListCycleDetector cycleDetector = new LinkedListCycleDetector();
        boolean hasCycle = cycleDetector.hasCycle(head);
        System.out.println("Has Cycle: " + hasCycle);
    }
}
