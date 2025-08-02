package src.Collections;

public class MyHashSet<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Node<E>[] table;
    private int size;

    //Для хранения данных в сете
    private static class Node<E> {
        final E value;
        final int hash;
        Node<E> next;

        Node(E value, int hash, Node<E> next) {
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }

    public MyHashSet() {
        table = (Node<E>[]) new Node[DEFAULT_CAPACITY];
    }

    public boolean insert(E value) {
        if (value == null) {
            throw new IllegalArgumentException("Null values are not allowed");
        }

        int hash = hash(value);
        int index = indexFor(hash, table.length);

        // Проверка на наличие такого же элемента
        for (Node<E> node = table[index]; node != null; node = node.next) {
            if (node.hash == hash && (node.value.equals(value))) {
                return false; // элемент уже существует
            }
        }

        // Добавляем в начало
        table[index] = new Node<>(value, hash, table[index]);
        size++;

        // Проверяем надо ли расширять наш сет
        if (size > table.length * LOAD_FACTOR) {
            resize();
        }

        return true;
    }

    public boolean remove(E value) {
        if (value == null) {
            return false;
        }

        int hash = hash(value);
        int index = indexFor(hash, table.length);
        Node<E> prev = null;
        Node<E> current = table[index];

        while (current != null) {
            if (current.hash == hash && (current.value.equals(value))) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }

        return false;
    }

    public int size() {
        return size;
    }

    private int hash(E value) {
        return value.hashCode();
    }

    private int indexFor(int hash, int length) {
        return hash & (length - 1);
    }

    private void resize() {
        Node<E>[] oldTable = table;
        table = (Node<E>[]) new Node[oldTable.length * 2];

        for (Node<E> node : oldTable) {
            while (node != null) {
                Node<E> next = node.next;
                int newIndex = indexFor(node.hash, table.length);
                node.next = table[newIndex];
                table[newIndex] = node;
                node = next;
            }
        }
    }
}
