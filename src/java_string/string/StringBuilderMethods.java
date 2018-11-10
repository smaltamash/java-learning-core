package java_string.string;
public class StringBuilderMethods
{
	public static void main(String []args)
	{
		StringBuilder sb1=new StringBuilder("Hello ");
		sb1.append("Pooja Aggarwal"); //Now Original String is Changed 
		System.out.println(sb1); //prints Hello Pooja Aggarwal
        StringBuilder sb2=new StringBuilder("KArora");
		sb2.insert(1,"ajal "); //Now Original String is Changed 
		System.out.println(sb2); //prints Kajal Arora
 		StringBuilder sb3=new StringBuilder("Pkujt Kaur");
		sb3.replace(1,5,"riya"); //Now Original String is Changed 
		System.out.println(sb3); //prints Priya Kaur
 		StringBuilder sb4=new StringBuilder("Ffjdsaiza Khan");
		sb4.delete(1,5); //Now Original String is Changed 
		System.out.println(sb4); //prints Faiza Khan
 		StringBuilder sb5=new StringBuilder("atpuG ayiR");
		sb5.reverse(); //Now Original String is Changed 
		System.out.println(sb5); //prints Riya Gupta
 		StringBuilder sb6=new StringBuilder();
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