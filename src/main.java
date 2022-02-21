import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < 5; i++) {
            stack1.push(1);
        }
        System.out.println("Stack 1: " + stack1);

        int[] array = new int[4];
        for (int j = 0; j < 5; j++) {
            int value = stack1.pop();
            stack2.push(value);
        }
        System.out.println("Stack 2:" + stack2);
    }
}
