package braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        char last;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.out.println("Closed } but not opened at " + i);
                    } else if (last != '{') {
                        System.out.println("Closed } but opened " + last + " at " + i);
                    }
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.out.println("Closed ] but not opened at " + i);
                    } else if (last != '[') {
                        System.out.println("Closed ] but opened " + last + " at " + i);
                    }
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.out.println("Closed ) but not opened at " + i);
                    } else if (last != '(') {
                        System.out.println("Closed ) but opened " + last + " at " + i);
                    }
                    break;

            }
        }

        while ((last = (char) stack.pop()) != 0){
            System.out.println("opened " + last + " " +
                    "but not closed");
        }
    }
}
