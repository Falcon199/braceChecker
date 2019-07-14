package braceChecker;

public class Stack {
    private int array[] = new int[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size == 9) {
            System.out.println("stack has ended");
        } else {
            array[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }

    public int getSize() {
        return size;
    }
}
