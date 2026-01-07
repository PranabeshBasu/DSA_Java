import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        System.out.println(st);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
    }
}
