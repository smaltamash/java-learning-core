package java_internationalization.internationalization;
import java.util.Locale;
import java.text.NumberFormat;
public class InternationalizationNumberExample 
{
	static void printNumber(Locale locale)
	{
		double dbl=1050000.3245;
		NumberFormat formatter=NumberFormat.getNumberInstance(locale);
		String number=formatter.format(dbl);
		System.out.println(number+" for the locale "+locale);
	}
	public static void main(String args[])
	{
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.FRANCE);
		printNumber(Locale.JAPAN);	
 	}
}