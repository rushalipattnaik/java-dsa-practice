package linked_list;
import java.util.Scanner;

public class ReverseLinkedList {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

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
        ReverseLinkedList list = new ReverseLinkedList();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.insert(sc.nextInt());

        list.reverse();
        list.display();
        sc.close();
    }
}