package linked_list;
import java.util.Scanner;

public class FindMiddle {
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

    public int getMiddle() {
        if (head == null) return -1;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMiddle list = new FindMiddle();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.insert(sc.nextInt());

        System.out.println("Middle Element: " + list.getMiddle());
        sc.close();
    }
}