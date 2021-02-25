package daniel.tpo;

import daniel.tpo.FibonacciHeap.FibonacciHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciHeapTest {

    @Test
    void insert() {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(3);
        assertEquals(1, heap.getSize());
        heap.insert(2);
        heap.insert(1);
        assertEquals(3, heap.getSize());
    }

    @Test
    void removeMax() {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(17);
        heap.insert(15);
        heap.insert(20);
        heap.insert(16);
        assertEquals(20, heap.removeMax());
        assertEquals(3, heap.getSize());
    }

    @Test
    void getMax() {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(3);
        assertEquals(3, heap.getMax());
        heap.insert(4);
        assertEquals(4, heap.getMax());
        heap.insert(-1);
        assertEquals(4, heap.getMax());
    }

    @Test
    void testIndexOutOfBounds() {
        FibonacciHeap heap = new FibonacciHeap();
        assertThrows(IndexOutOfBoundsException.class, heap::getMax);
        assertThrows(IndexOutOfBoundsException.class, heap::removeMax);
    }
}