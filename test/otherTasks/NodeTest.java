package otherTasks;

import OtherProjects.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    private Node<Integer> node;

    @BeforeEach
    void setUp() {
        node = new Node<>(10);
    }

    @Test
    void hasData() {
        //when
        int data = node.getData();
        assertEquals(10, data);
    }

    @Test
    void canPointTo_nextNode() {
        //when
        Node<Integer> nextNode = node.getNext();
        assertNull(nextNode);

        node.setNext(new Node<>(15));
        assertNotNull(node.getNext());
        assertEquals(15, node.getNext().getData());
    }
}

