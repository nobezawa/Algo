package tree;

import java.util.Comparator;

/**
 * Created by nobesawa on 15/05/28.
 */
public class BinTree<K, V> {

    static class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;

        Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        K getKey() {
            return key;
        }

        V getData() {
            return data;
        }

        void print() {
            System.out.print(data);
        }
    }

    private Node<K, V> root;
    private Comparator<? super K> comparator = null;


}
