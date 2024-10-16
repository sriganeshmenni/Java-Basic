import java.util.Scanner; 
public class SimpleCalculator {
    public static int Calculate()
    {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in); 
            int res = 0;
            System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n");
            System.out.print("Enter Your Choice : ");
            int opt = sc.nextInt();
            if(opt>=1&&opt<=4){
            System.out.print("Enter Two Numbers : ");
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            switch(opt)
            {
                case 1:
                      res = value1+value2;
                      break;
                case 2:
                      res = value1-value2;
                      break;
                case 3:
                      res = value1*value2;
                      break;
                case 4:
                      res = value1/value2;
                      break;
                default:
                      System.out.println("+++++++++Invalid Choice+++++++++");
                      break;
            }
        }
              return res;
    }
    public static void main(String args[])
    {
       int result = SimpleCalculator.Calculate();
       System.out.println(result);
    }
}
