package java_string.string;
public class StringVsStringBufferHashCode
{
	public static void main(String[] args)
	{
		System.out.println("HashCode Test of String");
		String str="Heena ";
		System.out.println(str.hashCode());
		str+="Malik";
		System.out.println(str.hashCode()); 
		System.out.println("hashCode Test of StringBuffer");
		StringBuffer sb=new StringBuffer("Heena ");
		System.out.println(sb.hashCode());
		sb.append("Malik");
		System.out.println(sb.hashCode());
	}
}