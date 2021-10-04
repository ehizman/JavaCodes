package otherTasks;
import OtherProjects.LinkedList;
import OtherProjects.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LinkedListTest {
    LinkedList linkedList;
    Node<Integer> node;

    @BeforeEach
    void setUp() {
        node = new Node<>(5);
        linkedList = new LinkedList(node);
    }

    @Test
    void hasHead() {
        //when
        Node<Integer> head = linkedList.getHead();
        assertNotNull(head);
        assertEquals(node, head);
    }

    @Test
    void hasTail() {
        Node<Integer> tail = linkedList.getTail();
        assertNotNull(tail);
        assertEquals(node, tail);
    }

    @Test
    void hasSize() {
        assertEquals(1, linkedList.getSize());
    }

    @Test
    void add() {
        Node<Integer> newNode = new Node<>(20);
        linkedList.add(newNode);

        //size increases to 2
        assertEquals(2, linkedList.getSize());

        //this new guy na the new tail
        assertEquals(newNode, linkedList.getTail());
    }

    @Test
    void insert() {
        Node<Integer> newNode = new Node<>(20);
        linkedList.add(newNode);
        linkedList.add(newNode);

        newNode = new Node<>(30);
        linkedList.insert(1, newNode);

        assertEquals(4, linkedList.getSize());
        assertEquals(newNode, linkedList.getNode(1));
    }

    @Test
    void remove() {
        Node<Integer> newNode = new Node<>(20);
        linkedList.add(newNode);
        linkedList.add(newNode);

        Node<Integer> previousNode = linkedList.getNode(0);
        Node<Integer> nextNode = previousNode.getNext();

        linkedList.remove(1);

        assertEquals(2, linkedList.getSize());
        assertEquals(previousNode, linkedList.getNode(0));
        assertEquals(nextNode, linkedList.getNode(1));
    }
}
