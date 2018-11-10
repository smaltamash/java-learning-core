package java_internationalization.internationalization;
import java.util.Locale;
public class LocaleExample2EnglishInOtherLanguages 
{
	public static void main(String args[])
	{
		Locale enLocale=new Locale("en","US");
		Locale frLocale=new Locale("fr","FR");
		Locale esLocale=new Locale("es","ES");
        System.out.println("English language name (default) : "+enLocale.getDisplayLanguage());
        System.out.println("English language name in French : "+enLocale.getDisplayLanguage(frLocale));
        System.out.println("English language name in Spanish : "+enLocale.getDisplayLanguage(esLocale));
 	}
}