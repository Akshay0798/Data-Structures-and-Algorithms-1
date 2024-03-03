public class singleLinkedList {
    //create a data type Node
    public static class Node{
        // Khud ke node ka data 'data' and agle ka address contain kar raha he 'next'.
        int data;
        Node next;

        // constructor - class name ka method hota he aur me jo bhi likhunga
        // ya pass karunga vo above attribute me pass ho jainge
        Node(int data){
            this.data = data;
        }
    }
    public static void insertAtEnd(Node head,int val){
        Node newNode = new Node(val);
        Node pointer = head;
        while (pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = newNode;
    }
    public static int length(Node head){
        int count=0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void displayRec(Node head){
        if (head == null) return;
        System.out.println(head.data);
        displayRec(head.next);
    }
    public static void displayReverse(Node head){
        if (head == null) return;
        displayReverse(head.next);
        System.out.println(head.data);

    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(45);
        Node b = new Node(55);
        Node c = new Node(65);
        Node d = new Node(75);
        Node e = new Node(85);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        display(a);
//        displayRec(a);
//        displayReverse(a);
//        System.out.println(length(a));
        insertAtEnd(a,100);
        display(a);
    }
}
