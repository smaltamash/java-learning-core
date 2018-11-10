package basics_of_java.programs;
public class Armstrong
{
	static void armstrong(int no)
	{
		int length=noLength(no);
		int powSum=noPower(no,length);
		if(no==powSum)
		{
			System.out.println("\""+no+"\" is an Armstrong Number");
		}
		else
		{
			System.out.println("\""+no+"\" is not an Armstrong Number");
		}
	}
	static int noLength(int no)
	{
		int length=0;
		while(no>0)
		{
			no/=10;
			length++;
		}
		return length;
	}
	static int noPower(int no,int length)
	{
		int powSum=0;
		while(no>0)
		{
			int n=no%10;
			no/=10;
			int powNo=1;
			for(int i=0;i<length;i++)
			{
				powNo*=n;
			}
			powSum+=powNo;
		}
		return powSum;  
	}
	public static void main(String []args)
	{
		armstrong(153);
	}
}