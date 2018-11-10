package java_internationalization.internationalization;
import java.util.Locale;
import java.text.NumberFormat;
public class InternationalizationCurrencyExample 
{
	static void printCurrency(Locale locale)
	{
		double dbl=170500.3245;
		NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
		String currency=formatter.format(dbl);
		System.out.println(currency+" for the locale "+locale);
	}
	public static void main(String args[])
	{
		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.FRANCE);
		printCurrency(Locale.JAPAN);	
 	}
}