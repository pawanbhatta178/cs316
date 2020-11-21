/**

 This class is a top-down, recursive-descent parser for the following syntactic categories:

 <assignment list> --> <assignment> | <assignment> <assignment list>
 <assignment> --> <id> = <E> ";"
 <E> --> <term> | <term> + <E> | <term> - <E>
 <term> --> <primary> | <primary> * <term> | <primary> / <term>
 <primary> --> <id> | <int> | <float> | <floatE> | "(" <E> ")"

 The definitions of the tokens are given in the lexical analyzer class file "LexArithArray.java".

 The following variables/functions of "IO"/"LexArithArray" classes are used:

 static void display(String s)
 static void displayln(String s)
 static void setIO(String inFile, String outFile)
 static void closeIO()

 static void setLex()
 static String t // holds an extracted token
 static State state // the current state of the finite automaton
 static int getToken() // extracts the next token

 An explicit parse tree is constructed in the form of nested class objects.

 The main function will display the parse tree in linearly indented form.
 Each syntactic category name labeling a node is displayed on a separate line,
 prefixed with the integer i representing the node's depth and indented by i blanks.

 **/


public abstract class ParserStack extends LexArithArray
{
    static boolean errorFound = false;


    public static void errorMsg(int i)
    {
        errorFound = true;

        display(t + " : Syntax Error, unexpected symbol where");

        switch( i )
        {
            case 1:	displayln(" arith op or ) expected"); return;
            case 2: displayln(" id, int, float, or ( expected"); return;
            case 3:	displayln(" = expected"); return;
            case 4:	displayln(" ; expected"); return;
            case 5:	displayln(" id expected"); return;
        }
    }

    public static void main(String argv[])
    {
        // argv[0]: input file containing an assignment list
        // argv[1]: output file displaying the parse tree
        // argv[2]: output file displaying runtime stack data

    }
}