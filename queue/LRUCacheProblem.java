package queue;
import java.util.Scanner;
import java.util.HashMap;

class LRUCache {
    class Node {
        int key, val;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }
    
    Node head = new Node(0, 0), tail = new Node(0, 0);
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity;

    public LRUCache(int cap) {
        capacity = cap;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) remove(map.get(key));
        if (map.size() == capacity) remove(tail.prev);
        insert(new Node(key, value));
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}

public class LRUCacheProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cache capacity: ");
        int cap = sc.nextInt();
        LRUCache cache = new LRUCache(cap);

        while (true) {
            System.out.println("1.Put 2.Get 3.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                int k = sc.nextInt();
                int v = sc.nextInt();
                cache.put(k, v);
            } else if (choice == 2) {
                int k = sc.nextInt();
                System.out.println(cache.get(k));
            } else break;
        }
        sc.close();
    }
}