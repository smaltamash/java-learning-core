package java_io.io;
import java.util.Scanner;
public class ScannerClassExample2
{
	public static void main(String args[])
	{
		String st="20 Faiza 5 Khan 90 Heena Akmal";
		Scanner sc=new Scanner(st).useDelimiter("\\s");
		System.out.println(sc.nextInt()); //There will be InputMismatchException if we comment out this line because ther is int first in String st
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
	} 
}

