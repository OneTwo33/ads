package ru.onetwo33.lesson3;

public class Main {
    public static void main(String[] args) {
//        testStack();
        testQueue();
    }

    private static void testQueue() {
        Queue<Integer> queue = new PriorityQueueImpl<>((5));
        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

        System.out.println("add element: " + queue.insert(17));
        queue.display();

    }

    private static void testStack() {
        Stack<Integer> stack = new StackImpl<>(5);
        if (!stack.isEmpty()) {
            stack.pop();
        }
        addToStack(stack, 12);
        addToStack(stack, 16);
        addToStack(stack, 22);
        addToStack(stack, 5);
        addToStack(stack, 1);
        addToStack(stack, 32);
        stack.display();
        System.out.println("top value: " + stack.pop());
        stack.display();
        System.out.println("top value: " + stack.peek());
    }

    private static boolean addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }
}
