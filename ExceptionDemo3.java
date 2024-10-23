public class ExceptionDemo3 {
    public static void main(String[] args) {
        String input1 = "Ganesh";
        String input2 = "20";
        int z = Integer.parseInt(input1)+ Integer.parseInt(input2);
        System.out.println("Sum = "+z);
        System.out.println("Task completed");
        /**Exception in thread "main" java.lang.NumberFormatException: For input string: "Ganesh"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:588)
        at java.base/java.lang.Integer.parseInt(Integer.java:685)
        at ExceptionDemo3.main(ExceptionDemo3.java:5) */
    }
}
