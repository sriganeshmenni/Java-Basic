interface factorial
{
  int Findfact(int n);
}
class Dev1 implements factorial
{
  public int Findfact(int n)
  {
    int fact=1;
    for(int i=n;i>=2;i--){
      fact=fact*i;
    }
    return fact;
}
}
class Dev2 implements factorial
{
    public int Findfact(int n)
    {
      if(n==1 || n==0)
          return 1;
      else
          return n*Findfact(n-1);
    }
}

public class FactorialDemo{
      public static void main(String args[]){
        factorial f;
        f=new Dev1();
        System.out.println("factorial caculation using iteration:- "+f.Findfact(6));
        f=new Dev2();
        System.out.println("factorial caculation using iteration:- "+f.Findfact(6));
        
      }
}