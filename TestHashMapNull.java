package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMapNull {

	public static void main(String[] args){
		Map<String, Integer> hashMap = new HashMap<String, Integer>(); 
		
		
		hashMap.put(null, 2);
		hashMap.put(null, 1);
		int i = hashMap.get(null);
		System.out.println(i);
		
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>(); 
		
		hashMap2.put(1, "a");
		hashMap2.put(2, "b");
		hashMap2.put(3, "c");
		hashMap2.put(4, "d");
		hashMap2.put(5, "e");
		hashMap2.put(6, "f");
		hashMap2.put(7, "g");
		
		Iterator<Entry<Integer, String>> iMap2 = hashMap2.entrySet().iterator();
		while(iMap2.hasNext()) {
			Entry<Integer, String> entry = iMap2.next();  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		    iMap2.remove();
		}
		System.out.println("===============");
		iMap2 = hashMap2.entrySet().iterator();
		
		while(iMap2.hasNext()) {
			Entry<Integer, String> entry = iMap2.next();  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		    
		}
		for (Integer key : hashMap2.keySet()) {
			
		    System.out.println("Key = " + key);  
		    
		}
	}
}
