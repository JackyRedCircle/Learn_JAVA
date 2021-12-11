import java.lang.reflect.Type;
import java.sql.ClientInfoStatus;

public class Day5 {
    public static void main(String[] args) {
        String[] numArr = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카", "타", "파", "하"};

        LinkedList ll = new LinkedList();

        for (int i = 0; i < numArr.length; i++) {
            ll.append(numArr[i]);
        }

        int fromStart = 4;
        int fromLast = 3;

        System.out.println(ll.getOrderNum("달"));
    }
}



class LinkedList {
    Node header;

    static class Node {
        String data;
        Node next = null;

        Node(String data) {
            this.data = data;
        }
    }

    LinkedList () {
        header = new Node(null);
    }

    Node getStrat () {
        return this.header;
    }

    int getOrderNum (String data) {
        Node n = this.header;
        int count = 0;
        int dataNum = 0;
        boolean noDataSign = true;
        while (n.next != null) {
            if (n.data == data) {
                noDataSign = false;
                dataNum = count;
            }
            count++;
            n = n.next;
        }
        if (noDataSign == true) {
            System.out.printf("error: the data %s is not in list. error code :",data);
            return 0;
        }
        else {
            return dataNum;
        }
    }

    void append (String data) {
        Node end = new Node(data);
        Node n = header;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    void delete (String data) {
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

    static Node KthToFirst (Node n, int k) {
        for (int i = 0; i < k; i++) {
            n = n.next;
        }
        return n;
    }

    static Node KthToLast (Node firstNode, int k) {

        int count = 1;
        Node n = firstNode;

        while (n.next != null) {
            n = n.next;
            count++;
        }

        n = firstNode;

        for (int i = 1; i < count + 1 - k; i++) {
            n = n.next;
        }
        return n;
    }

    static int KthToLastPrint (Node n, int k) {
        if (n == null) {
             return 0;
        }

        int count = KthToLastPrint(n.next, k) + 1;
        if (count == k) {
            System.out.println(count+"th data from last is "+n.data);
        }
        return count;
    }
}