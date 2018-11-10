package java_new_features.java_7_features;
public class BinaryLiteralsExample2
{
	public static void main(String[] args)
    {
    	byte b1=5; //A decimal value
    	//Using binary of 5
    	byte b2=0b101; //using 0b, the b can be lower or upper case
    	//Declaring negative binary
    	byte b3=-0b101;
    	//Using underscore in binary literal
    	byte b4=0b101_0;
    	System.out.println("b1 = "+b1);
    	System.out.println("b2 = "+b2);
    	System.out.println("b3 = "+b3);
    	System.out.println("b4 = "+b4);
    	//Check whether binary and decimal are equal
    	System.out.println("is b1 and b2 equal : "+(b1==b2));
    	//Perform operation on binary value
    	System.out.println("b2+1 = "+(b2+1));
    	//Perform opeartion on negative binary value
    	System.out.println("b3+1 = "+(b3+1));
    	System.out.println("b4x2 = "+(b4*2));
    }
}