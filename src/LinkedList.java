public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return true;
    }

    public boolean insert(int data, int position) {
        if (position < 0) {
            return false;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return true;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                if (current == null) {
                    return false;
                }
                current = current.next;
            }
            if (current == null) {
                return false;
            }
            newNode.next = current.next;
            current.next = newNode;
            return true;
        }
    }

    public boolean delete(int data) {
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public void displayReverse() {
        displayReverseRecursive(head);

    }

    private void displayReverseRecursive(Node node) {
        if (node == null) {
            return;
        }
        displayReverseRecursive(node.next);
        System.out.print(node.data + " ");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public int find(int data) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

}