package linked_list;
import java.util.Scanner;

public class InsertBeginningEnd {
    Node head = null;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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
        InsertBeginningEnd list = new InsertBeginningEnd();
        while (true) {
            System.out.println("1.Insert Beginning 2.Insert End 3.Display 4.Exit");
            int choice = sc.nextInt();
            if (choice == 1) list.insertAtBeginning(sc.nextInt());
            else if (choice == 2) list.insertAtEnd(sc.nextInt());
            else if (choice == 3) list.display();
            else break;
        }
        sc.close();
    }
}