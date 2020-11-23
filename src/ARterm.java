// the class of activation records of term() function

class ARterm extends AR
{
    Term term;
    Term returnVal;
    Primary primary;
    void term() {
        // <term> --> <primary> | <primary> * <term> | <primary> / <term>
//        Primary primary = primary();
        ARprimary ar=new ARprimary();
        RuntimeStack.push(ar);
        ar.primary();
        primary=ar.returnVal;
        RuntimeStack.pop();
        if (LexArithArray.state == LexArithArray.State.Times) {
            LexArithArray.getToken();
//            Term term = term();
            ARterm ar_=new ARterm();
            RuntimeStack.push(ar_);
            ar_.term();
            term=ar_.returnVal;
            RuntimeStack.pop();

//            return new MulTerm(primary, term);
            returnVal=new MulTerm(primary,term);
        } else if (LexArithArray.state == LexArithArray.State.Div) {
            LexArithArray.getToken();
//            Term term = term();
            ARterm ar_=new ARterm();
            RuntimeStack.push(ar_);
            ar_.term();
            term=ar_.returnVal;
            RuntimeStack.pop();

//            return new DivTerm(primary, term);
            returnVal=new DivTerm(primary,term);
        } else {
//            return new SinglePrimary(primary);
            returnVal=new SinglePrimary(primary);
        }
    }
}