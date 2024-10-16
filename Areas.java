import java.util.Scanner;
class Areaofcircle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float radius,Area;
        System.out.print("Enter Radius = ");
        radius = sc.nextFloat();
        Area = 3.142f*radius*radius;
        System.out.printf("The area of circle is = %.2f",Area);
        sc.close();
    }
}
class PerimeterofRectangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int len ,wid,per;
        System.out.println("Enter lenght and Width :");
        System.out.print("Enter lenght = ");
        len = sc.nextInt();
        System.out.print("Enter Width = ");
        wid = sc.nextInt();
        per = 2*(len+wid);
        System.out.println("The Perimeter of Rectangle is = "+per);
        sc.close();
    }
}