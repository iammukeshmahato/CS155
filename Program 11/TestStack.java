public class TestStack {
    public static void main(String[] args) {
        MyStack<String> fruits = new MyStack<>();

        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Cherry");
        fruits.push("Grape");
        fruits.push("Mango");
        fruits.push("Orange");

        System.out.println("Stack size: " + fruits.size());
        System.out.println("Top element: " + fruits.peek());
        System.out.println("Popped element: " + fruits.pop());
        System.out.println("Stack size after pop: " + fruits.size());
        System.out.println("Is stack empty? " + fruits.isEmpty());

        // Displaying the stack original contents
        System.out.println("\nStack contents:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }

        // showing the stack contents in reverse order
        System.out.println("\n\nStack contents in reverse order:");
        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.print(fruits.get(i) + " ");
        }

        // line break
        System.out.println("\n");

        fruits.clear();

        System.out.println("Stack size after clear: " + fruits.size());
        System.out.println("Is stack empty after clear? " + fruits.isEmpty());

    }
}
