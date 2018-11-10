package java_string.string;
public class StringClassMethods
{
	public static void main(String []args)
	{
		String s=" SachinTendulkar "; 
		System.out.println(s.toUpperCase()); //SACHINTENDULKAR
		System.out.println(s.toLowerCase()); //sachintendulkar
		System.out.println(s); // SachinTendulkar (no change in the Original)
        System.out.println(s.trim()); //Eleminates Whitespace before and after String
        System.out.println(s.charAt(1)); //S
        System.out.println(s.charAt(4)); //h
        System.out.println(s.length()); //17
        String s1=new String("Ritika");
        String s2=s1.intern();
        System.out.println(s2); //Ritika
        int a=10;
        String s3=String.valueOf(a); //int converted to string
        System.out.println(s3+10); //1010
        String s4="java is a Programming Language, java is a Platform, java is an Island";
        System.out.println(s4.replace("java","Java")); //java replaced with Java
        System.out.println(s); // SachinTendulkar (no change in the Original)
    }
}