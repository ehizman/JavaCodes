package OtherProjects;

public class LinkedList {
    private int size;
    private Node<Integer> head;
    private Node<Integer> tail;

    public LinkedList(Node<Integer> node) {
        head = node;
        size++;
        tail = node;
    }

    public Node<Integer> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void add(Node<Integer> node)
    {
        /*Node<Integer> currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
        }
        currentNode = node;
        tail = currentNode;
        size++;*/

        tail.setNext(node);
        tail = node;
        size++;
    }

    public Node<Integer> getTail() {
        return tail;
    }

    public void insert(int index, Node<Integer> newNode)
    {
        if(index == 0) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        Node<Integer> previousNode = getNode(index - 1);
        Node<Integer> nextNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(nextNode);
        size++;
    }

    public Node<Integer> getNode(int index) {

        if(index == 0) {
            return head;
        }

        Node<Integer> currentNode = head;

        int counter = 0;
        while (counter < index && currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }

        return currentNode;
    }

    public void remove(int index)
    {
        Node<Integer> previousNode = getNode(index - 1);
        Node<Integer> nextNode = previousNode.getNext();
        previousNode.setNext(nextNode);
        size--;
    }
}

