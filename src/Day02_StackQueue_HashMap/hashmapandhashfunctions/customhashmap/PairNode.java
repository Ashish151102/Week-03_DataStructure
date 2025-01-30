package Day02_StackQueue_HashMap.hashmapandhashfunctions.customhashmap;

public class PairNode<K, V> {
    K key;
    V value;
    PairNode <K, V> next;

    public PairNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
