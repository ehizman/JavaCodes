package OtherProjects;
public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return nextNode;
    }

    public void setNext(Node<T> next) {
        nextNode = next;
    }
}

