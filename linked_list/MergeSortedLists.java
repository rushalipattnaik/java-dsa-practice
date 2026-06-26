package linked_list;
import java.util.Scanner;

public class MergeSortedLists {
    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) curr.next = l1;
        else curr.next = l2;
        return dummy.next;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    private static Node buildList(Scanner sc) {
        int n = sc.nextInt();
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());
            if (head == null) { head = node; tail = node; }
            else { tail.next = node; tail = tail.next; }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size & sorted components of List 1: ");
        Node l1 = buildList(sc);
        System.out.print("Enter size & sorted components of List 2: ");
        Node l2 = buildList(sc);
        
        Node mergedHead = merge(l1, l2);
        display(mergedHead);
        sc.close();
    }
}