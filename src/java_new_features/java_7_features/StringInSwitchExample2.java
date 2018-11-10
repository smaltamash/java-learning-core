package java_new_features.java_7_features;
public class StringInSwitchExample2
{
	public static void main(String[] args)
    {
    	String game="Card Game";
    	switch(game)
    	{
    		case "Hockey":case "Cricket":case "Football":
    		{
    			System.out.println("Lets play outdoor Game");
    		}
    		break;
    		case "Ludo":
    		case "Chess":
    		case "Card Game":
    		case "Puzzles":
    		{
    			System.out.println("Lets play Indoor Game");
    		}
    		break;

    	}
    }
}