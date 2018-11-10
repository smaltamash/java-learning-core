package java_io.io;
import java.util.Scanner;
public class ScannerClassExample1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Enter your Roll No");
		int rollno=sc.nextInt();
		System.out.println("Enter your Fee");
		double fee=sc.nextDouble();
		System.out.println("Name : "+name+"\nRoll No : "+rollno+"\nFee : "+fee);
		sc.close();
	} 
}
  