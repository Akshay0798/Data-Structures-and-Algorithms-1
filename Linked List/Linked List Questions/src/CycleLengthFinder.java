//Q: find length of cycle
public class CycleLengthFinder {
    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    class Solution {
        public int findCycleLength(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if (fast == slow) {
                    // Calculate length of the cycle
                    ListNode temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                    } while (temp != slow);
                    return length;
                }
            }
            return 0; // No cycle found
        }
    }

    public static void main(String[] args) {
        CycleLengthFinder cycleLengthFinder = new CycleLengthFinder();
        ListNode head = cycleLengthFinder.new ListNode(1);
        ListNode second = cycleLengthFinder.new ListNode(2);
        ListNode third = cycleLengthFinder.new ListNode(3);
        ListNode fourth = cycleLengthFinder.new ListNode(4);
        ListNode fifth = cycleLengthFinder.new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second; // Creating a cycle

        Solution solution = cycleLengthFinder.new Solution();
        int cycleLength = solution.findCycleLength(head);
        System.out.println("Length of the cycle: " + cycleLength);
    }
}

