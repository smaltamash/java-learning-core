package java_new_features.java_7_features;
public class BinaryLiteralsExample1
{
	public static void main(String[] args)
    {
    	//Binary Literals in byte type
		byte b1=0b101; //Using 0b, The b can be lower or upper case
		byte b2=0B101; //Using 0B
		System.out.println("-----Binaary Literal in Byte-----");
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		//Binary Literals in short type
		short s1=0b101; //Using 0b, The b can be lower or upper case
		short s2=0B101; //Using 0B
		System.out.println("-----Binaary Literal in Short-----");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		//Binary Literals in int type
		int i1=0b101; //Using 0b, The b can be lower or upper case
		int i2=0B101; //Using 0B
		System.out.println("-----Binaary Literal in Integer-----");
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		//Binary Literals in long type
		long l1=0b0000011111100001; //Using 0b, The b can be lower or upper case
		long l2=0B0000011111100001; //Using 0B
		System.out.println("-----Binaary Literal in Long-----");
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
    }
}