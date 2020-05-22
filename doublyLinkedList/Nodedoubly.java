package doublyLinkedList;

public class Nodedoubly {
	private int value;
    private Nodedoubly next = null;
    private Nodedoubly prev = null;

    public Nodedoubly(int value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPrev() {
        return prev != null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodedoubly next() {
        return next;
    }

    public void setNext(Nodedoubly next) {
        this.next = next;
    }

    public Nodedoubly getPrev() {
        return prev;
    }

    public void setPrev(Nodedoubly prev) {
        this.prev = prev;
    }
}
