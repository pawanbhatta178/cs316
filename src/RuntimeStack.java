import java.util.Stack;

public class RuntimeStack {
    static Stack<AR> runtimeStack = new Stack<AR>();


    public static void push(AR o){
         runtimeStack.push(o);
    }

    public static void pop(){
        runtimeStack.pop();
    }
}
