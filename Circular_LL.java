public class Circular_LL {

    Node head;
    Node p;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        p.next = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            p = newNode;
            newNode.next = head;
        } else {
            p.next = newNode;
            p = newNode;
            p.next = head;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        head = head.next;
        p.next = head;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast;
        secondLast = head;
        Node lastNode;
        lastNode = head.next;

        while (lastNode.next != head) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = head;
    }

    public void display() {
        Node p;
        p = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                System.out.print(p.data+"->");
                p = p.next;
            } while (p != head);
            System.out.println(head.data);
            System.out.println("The head elements is :"+head.data);
        }
    }

    public static void main(String[] args) {
        Circular_LL l = new Circular_LL();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.addFirst(0);
        l.deleteFirst();
        l.deleteLast();
        l.display();
    }
}
