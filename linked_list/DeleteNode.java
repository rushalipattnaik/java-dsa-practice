package linked_list;
import java.util.Scanner;

public class DeleteNode {
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

    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
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
        DeleteNode list = new DeleteNode();
        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.insert(sc.nextInt());
        
        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();
        list.delete(key);
        list.display();
        sc.close();
    }
}