import java.util.*;

public abstract class InterpreterStack extends ParserStack {
    public static HashMap<String, Val> varState = new HashMap<String, Val>();
    // program state, i.e., virtual memory for variables


    public static void main(String argv[]) {
        // argv[0]: input file containing an assignment list
        // argv[1]: output file displaying the parse tree
        // argv[2]: output file displaying runtime stack data
        // The interpretation result will be displayed on the terminal.
    }
}