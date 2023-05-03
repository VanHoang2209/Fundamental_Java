package Collections.Stack;

import java.util.Stack;

public class test {
    Stack<Integer> stack = new Stack<Integer>();
    static void stackPush (Stack stack){
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stackPop (Stack stack){
        int x = stack.size();
        for (int i = 0; i < x; i++) {
            System.out.println(stack.pop());
        }
    }

    static void stackPeek (Stack stack){
        int x = stack.size();
        for (int i = 0; i < x; i++) {
            System.out.println(stack.peek());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stackPush(stack);
        stackPop(stack);
        stackPeek(stack);
    }
}
