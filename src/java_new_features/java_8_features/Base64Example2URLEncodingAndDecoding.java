package java_new_features.java_8_features;
import java.util.Base64;
public class Base64Example2URLEncodingAndDecoding 
{
	public static void main(String[] args)
	{
		//Getting Encoder
		Base64.Encoder encoder=Base64.getUrlEncoder();
		//Encoding URL
		String eStr=encoder.encodeToString("http://www.mywebsite.com/home/".getBytes());
		System.out.println("Encoded URL : "+eStr);
		//Getting Decoder
		Base64.Decoder decoder=Base64.getUrlDecoder();
		//Decoding String
		String dStr=new String(decoder.decode(eStr));
		System.out.println("Decoded URL : "+dStr); 
	}
}