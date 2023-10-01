import java.util.*;
import java.io.*;


public class Dictionary {

	/** Class field members */
	private HashMap<String, String> dictionary;
	
	/** Empty argument constructor */
	public Dictionary() {
		dictionary = new HashMap<String, String>();
	}// end of empty argument constructor
	
	/** Loads an excel, csv, or txt file and formats the words and definitions 
	 *  into array pairs.
	 *  @throws FileNotFoundException if the file is not found. 
	 */
	public void loadDictionary() throws FileNotFoundException{
		File file = new File("DictionaryWordValuePairs.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			String data[] = scanner.nextLine().split("\t");
			dictionary.put(data[0], data[1]);
		}
		scanner.close();
	}//end loadDefinition
	
	
	/** Search the loaded dictionary for the given key word.
	 * @param key a word given to the method to search for its definition. 
	 */
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
	}//ends searchDictionary
	
	/** Print the dictionary list of words. */
	public void printDictionary() {
		for (Map.Entry<String, String> word : dictionary.entrySet()) {
			System.out.println("{" + word.hashCode() + " - " + word.getKey() + " => " + ": " + word.getValue() + "}");
		}
	}//ends printDictionary
}//end class
