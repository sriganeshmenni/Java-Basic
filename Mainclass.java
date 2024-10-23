import java.util.Scanner;                          // importing builtin package
import test.firstpack.FirstClass;
public class Mainclass
{
	public static void main(String args[])
	{
		String name;
		int age;
		
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		age=sc.nextInt();

		FirstClass f=new FirstClass();z
		f.showInfo(name,age);

		sc.close();
	}
}