public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        linkedList.display();
        linkedList.reverse();
        System.out.println();

        linkedList.display();
        System.out.println();

        linkedList.insert(53,2);
        linkedList.delete(2);
        linkedList.display();


        System.out.println("========================================");
        linkedList.displayReverse();
    }
}