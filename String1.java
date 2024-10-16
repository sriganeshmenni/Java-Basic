public class String1 {
    public static void main(String args[]){
    String s1 = "AEC";
    String s2 = new String("AEC");
    String s3 = "AEC";
    String s4 = new String("AEC");
    String s5 = "AEC";
    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
    System.out.println(s1==s3);
    System.out.println(s2==s4);
    System.out.println(s1.equals(s5));
    System.out.println(s1.equalsIgnoreCase(s5));

    }
}
