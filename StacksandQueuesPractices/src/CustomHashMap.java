class CustomHashMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node(K k, V v) { key = k; value = v; }
    }

    private final int SIZE = 16;
    private Node<K, V>[] table = new Node[SIZE];

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    void put(K key, V value) {
        int index = hash(key);
        Node<K, V> node = table[index];
        if (node == null) {
            table[index] = new Node<>(key, value);
            return;
        }
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            if (node.next == null) break;
            node = node.next;
        }
        node.next = new Node<>(key, value);
    }

    V get(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) return node.value;
            node = node.next;
        }
        return null;
    }

    void remove(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];
        Node<K, V> prev = null;

        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) table[index] = node.next;
                else prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }
}
