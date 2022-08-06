public class SinglyLinkList {
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
        // System.out.println("The elements is :"+head.data);
    }

    public void addLast(int data) {
        Node p;
        p = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;
        // System.out.println("The last elements is :"+newNode.data);
    }

    public void addBetween(int data) {
        Node p;
        p = head;

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node p;
        p = head;

        while (p != null) {
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.print("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        head = head.next;
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

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        SinglyLinkList n = new SinglyLinkList();
        n.addFirst(3);
        n.addFirst(2);
        n.addLast(4);
        n.addFirst(1);
        n.addLast(5);
        n.addBetween(9);
        n.deleteFirst();
        n.deleteLast();
        n.deleteLast();
        n.deleteFirst();
        n.display();
    }
}
