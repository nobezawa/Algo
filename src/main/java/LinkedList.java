import java.util.Comparator;

/**
 * Created by nobesawa on 15/05/06.
 */
public class LinkedList<E> {

    class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head; // 先頭ノード
    private Node<E> crnt; // 着目ノード

    public LinkedList() {
        head = crnt = null;
    }

    /*ノードを探索*/
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;
        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }

    public void addFirst(E obj) {
        Node<E> ptr = head; // 挿入前の先頭ノード
        head = crnt = new Node<E>(obj, ptr);
    }

    public void addLast(E obj) {
        if(head == null) {
            addFirst(obj);
        }else{
            Node<E> ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = crnt = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head == null) {
                removeFirst();
                return;
            }

            Node<E> ptr = head;
            Node<E> pre = head;
            while (ptr.next != null) {
                pre = ptr;
                ptr = ptr.next;
            }
            pre.next = null;
            crnt = pre;
        }
    }

}
