public class ExceptionDemo2 {
    public static void main(String[] args) {
        int x[] = {10,20,30,40,50};
        try
        {
            for(int i=0;i<=x.length;i++)
            {
            System.out.print(x[i]+" ");
            }
        }
        catch(Exception obj)
        {
            System.out.println("\n"+"i values crosses the array index");
            System.out.println("OBJECT = "+ obj);
            System.out.println(obj.getMessage());
            obj.printStackTrace();
        }
        System.out.println("Task completed");
    }
}
