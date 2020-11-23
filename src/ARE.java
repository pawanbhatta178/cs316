// the class of activation records of E() function

class ARE extends AR
{
    E e;
    Term term;
    E returnVal;
  void e(){
//      Term term = term();
      ARterm ar=new ARterm();
      RuntimeStack.push(ar);
      ar.term();
      term=ar.returnVal;
      RuntimeStack.pop();

      if ( LexArithArray.state == LexArithArray.State.Plus )
      {
          LexArithArray.getToken();
//          E e = E();
          ARE ar_=new ARE();
          RuntimeStack.push(ar_);
          ar_.e();
          e=ar_.returnVal;

//          return new AddE(term, e);
          returnVal=new AddE(term, e);
      }
      else if ( LexArithArray.state == LexArithArray.State.Minus )
      {
          LexArithArray.getToken();
//          E e = E();
          ARE ar_=new ARE();
          RuntimeStack.push(ar_);
          ar_.e();
          e=ar_.returnVal;

//          return new SubE(term, e);
          returnVal=new SubE(term,e);
      }
      else {
//          return new SingleTerm(term);
          returnVal=new SingleTerm(term);
      }
  }
}