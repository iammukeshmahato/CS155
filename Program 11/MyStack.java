import java.util.ArrayList;

public class MyStack<Item> extends ArrayList<Item> {
    public void push(Item item) {
        add(item);
    }
    public Item pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return remove(size() - 1);
    }
    public Item peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return get(size() - 1);
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
        return super.size();
    }
    public void clear() {
        super.clear();
    }

}
