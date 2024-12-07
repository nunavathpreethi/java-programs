public class Stackclass {
    static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(char data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static char pop() {
            if (isEmpty()) {
                return '-';
            }
            char top = head.data;
            head = head.next;
            return top;
        }

        public static char peek() {
            if (isEmpty()) {
                return '-';
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        String my_string = "maddam";
        int n = my_string.length();
        int i = 0;
        for (i = 0; i < n / 2; i++) {
            s.push(my_string.charAt(i));
        }
        // If the string length is odd, skip the middle character
        if (n % 2 != 0) {
            i++;
        }

        // Compare the second half of the string with the stack
        for (; i < n; i++) {
            if (my_string.charAt(i) == s.pop()) {
                continue;
            } else {
                System.out.println("It's not a palindrome");
                return;
            }
        }
        System.out.println("It's a palindrome string");
    }
}
