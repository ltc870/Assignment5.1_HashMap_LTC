import java.util.*;
import java.io.*;


public class Dictionary {


	private HashMap<String, String> dictionary;
	
	public Dictionary() {
		dictionary = new HashMap<String, String>();
	}
	
	public void loadDictionary() throws FileNotFoundException{
		File file = new File("DictionaryWordValuePairs.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			String data[] = scanner.nextLine().split("\t");
			dictionary.put(data[0], data[1]);
		}
		scanner.close();
	}//end loadDefinition
	
	
	public void searchDictionary(String key) {
		
		int hashKey = key.hashCode();
		String definition = dictionary.get(key);
		
		if (definition != null) {
			System.out.println("The word: " + key);
			System.out.println("The definition: " + definition);
			System.out.println("The hashKey: " + hashKey);
		} else {
			System.out.println("Word could not be found!");
		}
	}
	
	public void printDictionary() {
		for (Map.Entry<String, String> word : dictionary.entrySet()) {
			System.out.println("{" + word.hashCode() + " - " + word.getKey() + " => " + ": " + word.getValue() + "}");
		}
	}
}//end class
