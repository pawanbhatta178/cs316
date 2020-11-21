abstract class Primary extends Obj
{
    void printParseTree(String indent)
    {
        IO.displayln(indent + indent.length() + " <primary>");
    }

    abstract Val Eval();
}