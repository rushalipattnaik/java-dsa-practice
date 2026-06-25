package linked_list;
import java.util.Scanner;

public class RemoveCycle {
    Node head = null;

    public void removeCycle() {
        if (head == null || head.next == null) return;
        Node slow = head, fast = head;
        boolean cycleExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }
        if (!cycleExists) return;
        slow = head;
        if (slow == fast) {
            while (fast.next != slow) fast = fast.next;
            fast.next = null;
            return;
        }
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
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
        RemoveCycle list = new RemoveCycle();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node tail = null;
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (list.head == null) {
                list.head = newNode;
                tail = list.head;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        System.out.print("Enter node index to link tail to for cycle creation: ");
        int index = sc.nextInt();
        if (index != -1) {
            Node temp = list.head;
            for (int i = 0; i < index; i++) temp = temp.next;
            tail.next = temp;
        }
        list.removeCycle();
        list.display();
        sc.close();
    }
}