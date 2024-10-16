import java.util.Scanner;
public class Stu1 {
   private static final String Name = null;
String roll_no;
   String name;
   float Avg;
   boolean isplaced;
   String Company1;
    public void ReadStudentInfo(){
         Scanner sc  =  new Scanner(System.in);
         System.out.print("Enter Roll:no :");
         roll_no = sc.nextLine();
         System.out.print("Enter Name : ");
         name = sc.nextLine();
         System.out.print("Enter Avg Marks : ");
         Avg = sc.nextFloat();
         sc.close();
    }
    public Stu1(String Name,String roll,float cgpa,String company,boolean placed ){
             name = Name;
             roll_no = roll;
             Avg = cgpa;
             Company1 = company;
             isplaced = placed;
    }
   public void displayStudentInfo()
   {
    System.out.println("=======================================================");
     System.out.println("Name :"+Name);
     System.out.println("Roll:No :"+roll_no);

     System.out.println("Avg Marks :"+Avg);
   }
   public static void  main(String args[]){
  

   }
}
