package java_new_features.java_8_features;
import java.util.Base64;
public class Base64Example1BasicEncodingAndDecoding 
{
	public static void main(String[] args)
	{
		//Getting Encoder
		Base64.Encoder encoder=Base64.getEncoder();
		//Creating byte array
		byte byteArr[]={1,2};
		//Encoding byte array
		byte byteArr2[]=encoder.encode(byteArr);
		System.out.println("Encoded byte array : "+byteArr2);
		byte byteArr3[]=new byte[5]; //Make sure it has enough size to store copied bytes
		int x=encoder.encode(byteArr,byteArr3); //Returns number of bytes written
		System.out.println("Encoded byte aray written to another array :"+byteArr3);
		System.out.println("Number of bytes written : "+x);
		//Encoding String
		String str=encoder.encodeToString("JavaLearning".getBytes());
		System.out.println("Encoded String : "+str);
		//Getting Decoder
		Base64.Decoder decoder=Base64.getDecoder();
		//Decoding String
		String dStr=new String(decoder.decode(str));
		System.out.println("Decoded String : "+dStr); 
	}
}