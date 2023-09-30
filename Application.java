import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Dictionary dictionary = new Dictionary();
		dictionary.loadDictionary();
		
		dictionary.printDictionary();
		System.out.println("");
		
		dictionary.searchDictionary("wench");
		System.out.println(" ");
		dictionary.searchDictionary("soil");
		System.out.println(" ");
		dictionary.searchDictionary("lordling");
		System.out.println(" ");
		dictionary.searchDictionary("steed");
		System.out.println(" ");
		dictionary.searchDictionary("champaign");
		
		
	}//end main
}//end class
