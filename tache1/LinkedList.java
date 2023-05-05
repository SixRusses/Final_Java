package m1.examen_final.tache1;

class LinkedList {
    Node first;
    Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = first;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public boolean contains(int value) {
        Node current = first;
        boolean found = false;

        while (current != null) {
            if (current.value == value) {
                found = true;
                break;
            }
            current = current.next;
        }

        return found;
    }

    public int indexOf(int value){
        Node current = first;
        int index = 0;

        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public void deleteFirst() {
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
    }

    public void deleteLast() {
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node current = first;
            while (current.next != last) {
                current = current.next;
            }
            last = current;
            last.next = null;
        }
    }
}
