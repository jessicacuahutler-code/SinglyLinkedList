public class Node<T> {
    // El dato o datos que guarda el nodo
    private T data;
    // Referencia al nodo siguiente (empieza en null por defecto)
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
