package m1.examen_final.tache1;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addFirst(1);
        list.addFirst(0);

        System.out.println(list.contains(5));
        System.out.println(list.contains(12));

        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(3));

        list.deleteFirst();

        list.deleteLast();

        System.out.println(list.contains(0));

        System.out.println(list.contains(15));
    }
}