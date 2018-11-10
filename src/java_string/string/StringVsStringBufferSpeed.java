package java_string.string;
public class StringVsStringBufferSpeed
{
	public static String concatWithString()
	{
		String t="Neha ";
		for(int i=0;i<10000;i++)
		{
			t+="Joshi";
		}
		return t;
	}
	public static String concatWithStringBuffer()
	{
		StringBuffer sb=new StringBuffer("Neha ");
		for(int i=0;i<10000;i++)
		{
			sb.append("Joshi");
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concatenating with String : "+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by Concatenating with StringBuffer : "+(System.currentTimeMillis()-startTime)+"ms");

	}
}