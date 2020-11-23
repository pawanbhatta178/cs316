// the class of activation records of primary() function

class ARprimary extends AR
{
    E e;
Primary returnVal;
void primary(){
    // <primary> --> <id> | <int> | <float> | <floatE> | "(" <E> ")"
    switch ( LexArithArray.state )
    {
        case Id:

            Id id = new Id(ParserStack.t);
            LexArithArray.getToken();
//            return id;
            returnVal=id;

        case Int:

            Int intElem = new Int(Integer.parseInt(ParserStack.t));
            LexArithArray.getToken();
//            return intElem;
            returnVal=intElem;

        case Float: case FloatE:

        Floatp floatElem = new Floatp(Float.parseFloat(ParserStack.t));
        LexArithArray.getToken();

//        return floatElem;
        returnVal=floatElem;

        case LParen:

            LexArithArray.getToken();

//            E e = E();
            ARE ar= new ARE();
            RuntimeStack.push(ar);
            ar.e();
            e=ar.returnVal;
            RuntimeStack.pop();

            if ( LexArithArray.state == LexArithArray.State.RParen )
            {
                LexArithArray.getToken();
                Parenthesized paren = new Parenthesized(e);
//                return paren;
                returnVal=paren;
            }
            else
            {
                ParserStack.errorMsg(1);
//                return null;
                returnVal=null;
            }

        default:
            ParserStack.errorMsg(2);
//            return null;
            returnVal=null;
    }

}
}