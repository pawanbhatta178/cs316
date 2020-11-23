// the class of activation records of assignment() function

class ARassignment extends AR
{
    E e;
    Assignment returnVal;

    void assignment() {
        if (LexArithArray.state == LexArithArray.State.Id) {
            String id = LexArithArray.t;
            LexArithArray.getToken();
            if (LexArithArray.state == LexArithArray.State.Assign) {
                LexArithArray.getToken();
//                E e = E();
                 ARE ar=new ARE();
                RuntimeStack.push(ar);
                ar.e();
                e=ar.returnVal;
                RuntimeStack.pop();
                if (LexArithArray.state == LexArithArray.State.Semicolon) {
                    LexArithArray.getToken();
//                    return new Assignment(id, e);
                    returnVal= new Assignment(id, e);

                } else
                    ParserStack.errorMsg(4);
            } else
                ParserStack.errorMsg(3);
        } else
              ParserStack.errorMsg(5);
        returnVal= null;
    }


}
