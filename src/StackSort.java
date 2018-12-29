import java.util.Stack;

public class StackSort {
    static Stack<Integer> sortStack(Stack<Integer> s){
        Stack<Integer> r = new Stack<>();
        int max = 0;
        int len = 0;
        int tmp = 0;
        while (!s.empty()){
            r.push(s.pop());
        }
        while(!r.empty()) {
            while (!r.empty()) {
                len++;
                if (r.peek() > max) {
                    max = r.peek();
                }
                s.push(r.pop());
            }
            for (int i = len; i > 0; i--) {
                if (s.peek() == max) {
                    tmp = s.pop();
                } else {
                    r.push(s.pop());
                }
            }
            s.push(tmp);
            len = 0;
            max = 0;
        }
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> test =  new Stack<>();
        test.push(2);
        test.push(5);
        test.push(3);
        test.push(1);
        test.push(4);
        System.out.println(test);
        System.out.println(sortStack(test));
    }
}
