package java_string.string;
public class StringBufferVsStringBuilderSpeed
{
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Neha ");
		for(int i=0;i<10000;i++)
		{
			sb.append("Joshi");
		}
		System.out.println("Time taken by Concatenating with StringBuffer : "+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Neha ");
		for(int i=0;i<10000;i++)
		{
			sb1.append("Joshi");
		}
		System.out.println("Time taken by Concatenating with StringBuilder : "+(System.currentTimeMillis()-startTime)+"ms");
	}
}