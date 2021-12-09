import java.sql.ClientInfoStatus;

public class Day5 {
    public static void main(String[] args) {
        int[] numArr = {1,3,2,5,5,4,8,7,6,5,3};

        LinkedList ll = new LinkedList();

        for (int i = 0; i < numArr.length; i++) {
            ll.append(numArr[i]);
        }
        ll.show();
        ll.removeOverlap();
        ll.show();
    }
}

class LinkedList {
    Node header;

    static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    LinkedList () {
        header = new Node(0);
    }

    void append (int data) {
        Node end = new Node(data);
        Node n = header;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    void delete (int data) {
        Node n = header;

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
            }
            else {
                n = n.next;
            }
        }
    }

    void show () {
        Node n = header.next;

        while (n.next != null) {
            System.out.printf(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }
    void removeOverlap () {
        Node n = header;

        while (n != null && n.next != null) {
            Node runner = n;

            while (runner.next != null) {
                if (n.data == runner.next.data) {
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }

            n = n.next;
        }
    }
}