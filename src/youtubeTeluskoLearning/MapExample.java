package youtubeTeluskoLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Map <String,String> phoneBook=new HashMap<>();
		phoneBook.put("Rabiun", "01722224313");
		phoneBook.put("shuvo", "018383012");
		
		
		
		//easy way
		Set<String> keys=phoneBook.keySet();
		for(String i:keys){
			System.out.println(i+" : "+phoneBook.get(i));
		} 
		
		System.out.println();
		//short way right
		Set<Map.Entry<String, String>> entries=phoneBook.entrySet();
		for(Map.Entry<String, String> eachEntry:entries){
			System.out.println(eachEntry.getKey()+" : "+eachEntry.getValue());
		}
		
		
	}

}
