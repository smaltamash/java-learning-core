package java_string.java_string_methods;
public class StringClassMethods
{
	public static void main(String[]args)
	{
		String s1="javateaching";
		char ch1=s1.charAt(4);
		System.out.println(ch1);
		//char ch2=s1.charAt(23); //Will give StringIndexOutOfBoundsException at runtime
		//System.out.println(ch2);
		String s2="Jasmine";
		String s3="Jasmine";
		String s4="jasmine";
		String s5="";
		//String s6=null;
		String s7="Katrina";
		String s8="Garima";
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s4));
		System.out.println(s2.compareTo(s5));
		System.out.println(s5.compareTo(s2));
		//System.out.println(s2.compareTo(s6));
		System.out.println(s2.compareTo(s7));
		System.out.println(s2.compareTo(s8));
		System.out.println(s4.compareTo(s8));
		String s9="Java String";
		s9.concat("is Printable");
		System.out.println(s9);
		s9=s9.concat(" is immutable so assign it explicitly");
		System.out.println(s9);
		String s10="Hello I am Gunjan Singh, I am a Good Dancer";
		System.out.println(s10.contains("I am Gunjan"));
		System.out.println(s10.contains("Laiba is a girl"));
		String s11="I love Icecream";
		System.out.println(s11.endsWith("cream"));
		System.out.println(s11.endsWith("neac"));
		System.out.println(s11.endsWith("m"));
		String s12="HEENA";
		String s13="HEENA";
		String s14="heena";
		String s15="Karishma";
		System.out.println(s12.equals(s13));
		System.out.println(s12.equals(s14));
		System.out.println(s12.equals(s15));
		String s16="RIA AGGARWAL";
		String s17="Ria Aggarwal";
		String s18="ria aggarwal";
		String s19="Kareena";
		System.out.println(s16.equalsIgnoreCase(s17));
		System.out.println(s16.equalsIgnoreCase(s18));
		System.out.println(s16.equalsIgnoreCase(s19));
		String s20="Sonali";
		String sf1=String.format("name is %s",s20);
		String sf2=String.format("Value is %f",32.33434);
		String sf3=String.format("Value of %32.21f",32.33434);
		System.out.println(sf1+"\n"+sf2+"\n"+sf3);
		String s21="Nina Kapadia";
		byte b[]=s21.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		String s22=new String("Hello Akansha, How are you?");
		char ch[]=new char[10];
		try
		{
			s22.getChars(6,16,ch,0);
			for(int i=0;i<10;i++)
			{
				System.out.println(ch[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		String s23="This is indexOf Example";
		int index1=s23.indexOf("is");
		int index2=s23.indexOf("index");
		System.out.println(index1+" "+index2);
		int index3=s23.indexOf('s',7);
		int index4=s23.indexOf('s');
		System.out.println(index3+" "+index4);
		String s24=new String("Aeysha");
		String s25="Aeysha";
		String s26=s24.intern();
		System.out.println(s23==s24);
		System.out.println(s24==s25);
		String s27="";
		//String s28=null;
		String s29="Fatima";
		System.out.println(s27.isEmpty());
		//System.out.println(s28.isEmpty());
		System.out.println(s29.isEmpty());
		String joinString=String.join("-","Welcome","to","Java");
		System.out.println(joinString);
		String s30="This is lastIndexOf Example";
		int index5=s30.lastIndexOf("Of");
		int index6=s30.lastIndexOf('e');
		System.out.println(index5+" "+index6);
		String s31="Alina Warner";
		System.out.println("The Length of String is : "+s31.length());
		String s32="My name is Ritika, My surname is Aggarwal";
		String replaceString1=s32.replace("is","was");
		String replaceString2=s32.replace('e','a');
		System.out.println(replaceString1+"\n"+replaceString2);
		String s33="My name is Vishaka, My surname is Sethi";
		String replaceString3=s33.replaceAll("is","was");
		String replaceString4=s33.replaceAll("e","a");
		String replaceString5=s33.replaceAll("\\s",""); // \\s==" "
		System.out.println(replaceString3+"\n"+replaceString4+"\n"+replaceString5);
		String s34="java String Split Method";
		String[] splitWords=s34.split("\\s");
		for(String w:splitWords)
		{
			System.out.println(w);
		} 
		String s35="Welcome to split World";
		System.out.println("Returning Words");
		for(String w:s35.split("\\s",0))
		{
			System.out.println(w);
		}
		System.out.println("Returning Words");
		for(String w:s35.split("\\s",1))
		{
			System.out.println(w);
		}
		System.out.println("Returning Words");
		for(String w:s35.split("\\s",2))
		{
			System.out.println(w);
		}
		String s36="Java String startsWith Method in Java";
		System.out.println(s36.startsWith("Ja"));
		System.out.println(s36.startsWith("java string"));
		String s37="Alvia Khan";
		System.out.println(s37.substring(3));
		System.out.println(s37.substring(0,5));
		String s38="Kajal Gupta";
		char c[]=s38.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		String s39="I aM Sania Taneja";
        String toLower=s39.toLowerCase();
        System.out.println(toLower);
        String s40="Hello i am Laiba Shamshi";
        String toUpper=s40.toUpperCase();
        System.out.println(toUpper); 
        String s41=" Lopa Mudra is a good    Dancer          ";
        String trim=s41.trim();
        System.out.println(trim);
        int value=90;
        String s42=String.valueOf(value);
        System.out.println(s42+10);
	}
}