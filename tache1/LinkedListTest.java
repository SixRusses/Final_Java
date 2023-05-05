package m1.examen_final.tache1;

import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testAddFirst() {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        assertEquals(ll.first.value, 1);
    }

    @Test
    public void testAddLast() {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        assertEquals(ll.first.value, 1);
        assertEquals(ll.last.value, 1);
    }

    @Test
    public void testContains() {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        assertTrue(ll.contains(2));
        assertFalse(ll.contains(4));
    }

    @Test
    public void testDeleteFirst() {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.deleteFirst();
        assertEquals(ll.first.value, 2);
        ll.deleteFirst();
        ll.deleteFirst();
        assertNull(ll.first);
    }

    @Test
    public void testDeleteLast() {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.deleteLast();
        assertEquals(ll.last.value, 2);
        ll.deleteLast();
        ll.deleteLast();
        assertNull(ll.last);
    }

    @Test
    public void testIndexOf() {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        assertEquals(ll.indexOf(3), 0);
        assertEquals(ll.indexOf(1), 2);
        assertEquals(ll.indexOf(4), -1);
    }
}
