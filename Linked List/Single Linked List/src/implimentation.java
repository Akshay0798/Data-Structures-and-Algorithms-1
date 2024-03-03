public class implimentation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{ //class linkedlist is like a structure
        Node head = null; //dataType
        Node tail = null; //dataType
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void insertAtStart(int val){
            Node temp = new Node(val);
            if (head==null){
                insertAtEnd(val);
//                head = temp;
//                tail = temp;
            }else{
                temp.next = head;
                head=temp;
            }
            size++;
        }
        void insertMiddle(int index,int val){
            Node newNode = new Node(val);
            Node travel= head;
            if (index == length()){
                insertAtEnd(val);
                return;
            } else if (index == 0) {
                insertAtStart(val);
                return;
            } else if (index < 0 || index > length()) {
                System.out.println("Invalid Index");
                return;
            }
            for (int i = 0; i < index-1 ; i++) {
                travel = travel.next;
            }
            newNode.next = travel.next;
            travel.next = newNode;
            size++;
        }
        int getAt(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int index){
            if (index < 0 || index >= length()) {
                System.out.println("Invalid Index");
                return;
            }
            if (index == 0) {
                head = head.next;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                // Update the tail if the last element is deleted
                if (index == length() - 1) {
                    tail = temp;
                }
            }
            size--;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        int length(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(88);
        ll.insertAtEnd(75);
        ll.insertAtEnd(85);
        ll.insertAtStart(52);
        ll.insertAtStart(82);
        ll.insertAtStart(52);
        ll.insertMiddle(2,4854);
//        System.out.println(ll.getAt(1));
//        System.out.println(ll.size);
        ll.deleteAt(2);
        ll.display();

    }
}
