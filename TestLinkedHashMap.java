package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestLinkedHashMap {

	public static void main(String[] args){
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>(); 
		
		linkedHashMap.put("5", "e");
		linkedHashMap.put("1", "a");
		linkedHashMap.put("2", "b");
		linkedHashMap.put("3", "c");
		linkedHashMap.put("4", "d");
		linkedHashMap.put("6", "f");
		linkedHashMap.put("7", "g");
	
		Iterator<Entry<String, String>> itLinked = linkedHashMap.entrySet().iterator();
		while(itLinked.hasNext()){
			Entry<String, String> entry = itLinked.next();
			
			System.out.println("Key :"+entry.getKey()+". Value :"+entry.getValue());
		}
		
		String value = linkedHashMap.get("3");
		
		System.out.println(value);
		
		itLinked = linkedHashMap.entrySet().iterator();
		while(itLinked.hasNext()){
			Entry<String, String> entry = itLinked.next();
			
			System.out.println("Key :"+entry.getKey()+". Value :"+entry.getValue());
		}
	}
}
