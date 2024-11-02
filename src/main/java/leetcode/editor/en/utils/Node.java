package leetcode.editor.en.utils;

public class Node {
    public int val;
    public int key;
    public Node next;
    public Node prev;

    public Node(int val, int key) {
        this.val = val;
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}

