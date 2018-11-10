package java_new_features.java_8_features;
import java.util.Base64;
public class Base64Example3MIMEEncodingAndDecoding 
{
	public static void main(String[] args)
	{
		//Getting MIME Encoder
		Base64.Encoder encoder=Base64.getMimeEncoder();
		String message="Hello, \nYou are informed regarding your inconsistency of work";
		String eStr=encoder.encodeToString(message.getBytes());
		System.out.println("Encoded MIME message : "+eStr);
		//Getting MIME Decoder
		Base64.Decoder decoder=Base64.getMimeDecoder();
		//Decoding MIME encoded message
		String dStr=new String(decoder.decode(eStr));
		System.out.println("Decoded MIME message : "+dStr); 
	}
}