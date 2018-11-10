package java_string.string;
public class StringBufferMethods
{
	public static void main(String []args)
	{
		StringBuffer sb1=new StringBuffer("Hello ");
		sb1.append("Pooja Aggarwal"); //Now Original String is Changed 
		System.out.println(sb1); //prints Hello Pooja Aggarwal
        StringBuffer sb2=new StringBuffer("KArora");
		sb2.insert(1,"ajal "); //Now Original String is Changed 
		System.out.println(sb2); //prints Kajal Arora
 		StringBuffer sb3=new StringBuffer("Pkujt Kaur");
		sb3.replace(1,5,"riya"); //Now Original String is Changed 
		System.out.println(sb3); //prints Priya Kaur
 		StringBuffer sb4=new StringBuffer("Ffjdsaiza Khan");
		sb4.delete(1,5); //Now Original String is Changed 
		System.out.println(sb4); //prints Faiza Khan
 		StringBuffer sb5=new StringBuffer("atpuG ayiR");
		sb5.reverse(); //Now Original String is Changed 
		System.out.println(sb5); //prints Riya Gupta
 		StringBuffer sb6=new StringBuffer();
 		System.out.println(sb6.capacity()); //16
 		sb6.append("Geeta ");
 		System.out.println(sb6.capacity()); //16
 		sb6.append("is a good Dancer");
 		System.out.println(sb6.capacity()); //34[(oldcapacity*2)+2]
 		sb6.ensureCapacity(10); //Now no Change
 		System.out.println(sb6.capacity());
 		sb6.ensureCapacity(50); //Now [(34*2)+2]=70
 		System.out.println(sb6.capacity()); //now 70
     }
}