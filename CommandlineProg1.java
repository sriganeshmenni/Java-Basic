public class CommandlineProg1 
{
    public static void main(String[] args)
    {
       System.out.println(args[0]);
       System.out.println(args[1]);
     //  System.out.println(args[0]+args[1]);//**gives you String we have change into integer**//
     //so we parse into integer
     int x = Integer.parseInt(args[0]) ;
     int y = Integer.parseInt(args[1]);
     System.out.println(x+y);
    }
}
