import java.util.Scanner;
public class Student {
   String roll_no;
   String name;
   float Avg;
   boolean isplaced;
   String company;
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
   public void displayStudentInfo()
   {
    System.out.println("=======================================================");
     System.out.println("Roll:No :"+roll_no);
     System.out.println("Name :"+name);
     System.out.println("Avg Marks :"+Avg);
   }
   public static void  main(String args[]){
    Student s1 = new Student();
    /**s1.roll_no =  "23A91A05B2";
    s1.name = "Ganesh";
    s1.avg = 86.4f;
    s1.displayStudentInfo();**/
   s1.ReadStudentInfo();

    Student s2 = new Student();
    /**s2.roll_no =  "23A91A05A3";
    s2.name = "Yaswanth";
    s2.avg = 80.4f;*/
    s2.ReadStudentInfo();

    Student s3 = new Student();
   /**  s3.roll_no =  "23A91A05B4";
    s3.name = "Jenny Krupal";
    s3.avg = 8000.4f;*/
    s3.ReadStudentInfo();

    s1.displayStudentInfo();

    s2.displayStudentInfo();

    s3.displayStudentInfo();

   }
}
