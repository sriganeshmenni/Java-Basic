interface Test{
    String compare(int x,int y);
}
public class FunctionalInterfaceDemo3 {
    public static void main(String[] args) {
        Test t = (x,y)->{
                String result = x>y? x+" is greatter than or equal to "+y:x+" is less than "+y;
                return result;
        };
        System.out.println(t.compare(14,6));
    }
}
