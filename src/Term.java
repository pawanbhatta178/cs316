abstract class Term extends Obj
{
    Primary primary;

    void printParseTree(String indent)
    {
        IO.displayln(indent + indent.length() + " <term>");
    }

    abstract Val Eval();
}