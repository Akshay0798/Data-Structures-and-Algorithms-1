public class DetectCycleInLinkedList {
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null; // Empty linked list
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Check for cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // No cycle
        if (!hasCycle) {
            return null;
        }

        // Move slow pointer back to the head
        slow = head;

        // Find the node where the cycle begins
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        DetectCycleInLinkedList solution = new DetectCycleInLinkedList();

        // Create a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        nodeNeg4.next = node2; // Cycle formed

        ListNode result = solution.detectCycle(head);
        if (result != null) {
            System.out.println("Node where the cycle begins: " + result.value);
        } else {
            System.out.println("No cycle");
        }
    }
}
