package linked_list;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class SinglyLinkedList {
    Node head = null;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node temp = null;
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (list.head == null) {
                list.head = newNode;
                temp = list.head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        list.display();
        sc.close();
    }
}