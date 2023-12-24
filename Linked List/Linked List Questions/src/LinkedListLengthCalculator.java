public class LinkedListLengthCalculator {
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public int getLength(ListNode head) {
        ListNode current = head; // Start with the head of the linked list
        int length = 0; // Initialize the length to 0

        while (current != null) { // Traverse the linked list until the end
            length++; // Increment the length for each node visited
            current = current.next; // Move to the next node
        }

        return length; // Return the final length of the linked list
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListLengthCalculator lengthCalculator = new LinkedListLengthCalculator(); // Create an instance of the LinkedListLengthCalculator class
        int length = lengthCalculator.getLength(head); // Call the getLength method to calculate the length

        System.out.println("Length of the linked list: " + length); // Print the calculated length
    }
}
