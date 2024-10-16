interface Parent 
{
    void getMarry();       //abstract method
    public default String getProfession()  // default method
    {
        return "Business";
    }
    public static String getSurName()  //static mathod 
    {
        return "SN";
    }
}
class child1 implements Parent 
{
    public void getMarry()
    {
        System.out.println("Child marry with X");
    }
}
class child2 implements Parent 
{
    public void getMarry() 
    {
        System.out.println("Child2 Marry with Y");
    }
    public String getProfession() 
    {
        return "Software Eningeer";
    }
}
public class Testing {
    public static void main(String args[]){
        Parent p;
        p=new child1();
        System.out.println("Child1 Information");
        p.getMarry();
        System.out.println("Child1 profession: "+p.getProfession());
        System.out.println("SureName: "+Parent.getSurName());

        p=new child2();
        System.out.println("Child2 Information");
        p.getMarry();
        System.out.println("Child2 profession: "+p.getProfession());
        System.out.println("SureName: "+Parent.getSurName());
    }
}