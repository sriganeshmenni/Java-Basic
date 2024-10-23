public class ExceptionDemo4 {
    public static void main(String[] args) {
        //NULL pointer exception 
        String s1 = "Aditya";
        System.out.println(s1.substring(0,3));
        s1 = null;
        System.out.println(s1.length());
        /**Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at ExceptionDemo4.main(ExceptionDemo4.java:7) */
    }
}
