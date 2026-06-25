package linked_list;
import java.util.Scanner;

public class DetectCycle {
    Node head = null;

    public boolean hasCycle() {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DetectCycle list = new DetectCycle();
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
        System.out.print("Create a cycle? Enter node index to link tail to (0 to " + (n-1) + ", or -1 for no cycle): ");
        int index = sc.nextInt();
        if (index != -1) {
            Node temp = list.head;
            for (int i = 0; i < index; i++) temp = temp.next;
            tail.next = temp;
        }
        System.out.println("Has Cycle: " + list.hasCycle());
        sc.close();
    }
}