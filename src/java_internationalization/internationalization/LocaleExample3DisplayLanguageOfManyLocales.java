package java_internationalization.internationalization;
import java.util.Locale;
public class LocaleExample3DisplayLanguageOfManyLocales 
{
	public static void main(String args[])
	{
		Locale locales[]={new Locale("en","US"),new Locale("es","ES"),new Locale("it","IT")};
		for(int i=0;i<locales.length;i++)
		{
			String displayLanguage=locales[i].getDisplayLanguage(locales[i]);
			System.out.println(locales[i].toString()+":"+displayLanguage);
		}
 	}
} 