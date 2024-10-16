import java.util.Scanner;
class Bodymassindex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float weight,height,Bmi;
         System.out.println("ENTER Weight and Height :");
         System.out.print("Enter Weight in kgs = ");
         weight = sc.nextFloat();
          System.out.print("Enter Height in meters = ");
         height = sc.nextFloat();
         Bmi=weight/(height*height);
         System.out.printf("Body Mass Index = %.2f",Bmi);
         sc.close();
    }
}