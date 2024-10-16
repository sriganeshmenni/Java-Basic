public class StringClassMethods {
    @SuppressWarnings("unused")
    public static void main(String args[])
    {
        String s1 = "Life is Beautiful";
        System.out.println("Given String s1 = "+s1);
        System.out.println("Lenght of s1 = "+s1.length());
        System.out.println("Character at 3 index = "+s1.charAt(3));
        System.out.println("Index of character of i from last = "+s1.lastIndexOf('i'));
        System.out.println("Contains 'is' = "+s1.contains("is"));
        System.out.println("Lowercase String s1 = "+s1.toLowerCase());
        System.out.println("UpperCase String s1 = "+s1.toUpperCase());
        System.out.println("After Apllying Trim = "+s1.trim());
        System.out.println("Substring from 4 = "+s1.substring(4));
        System.out.println("Substring form 4 to 7 = "+s1.substring(4,7));
        System.out.println("Replace is with Was = "+s1.replace("is","was"));

        String Words[] = s1.split(" ");
        System.out.println(Words[0]);
        System.out.println(Words[1]);
        System.out.println(Words[2]);

        for(int i=0;i<Words.length;i++){
            System.out.println(Words[i]);
        }
        String s2 = "Ganesh";
        String s3 =new String("Sri");
        System.out.println("Comparing s2 and s3 : "+s2.compareTo(s1));
    }
}
