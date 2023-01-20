package spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

// class is used to sort HasMap by value



public class MapSortByValue {

	public static void main(String[] args) {
		HashMap<String,String> map= new HashMap<>();
		LinkedHashMap<String,String> sortedMap= new LinkedHashMap<>();
		ArrayList<String> list=new ArrayList<>();
		
		map.put("Ram", "IT");
		map.put("Sham", "Computer");
		map.put("Rohit", "Mechanical");
		map.put("Chetan", "HR");
		map.put("Shambhu", "Electric");
		
		for(Map.Entry<String,String> entry:map.entrySet()) {
			list.add(entry.getValue());
		}
		Collections.sort(list,new Comparator<String>() {
			public int compare(String str,String str1) {
				return(str).compareTo(str1);
			}
			});
		
		    for(String str:list) {
			
			for (Entry<String,String>entry:map.entrySet()) {
				if(entry.getValue().equals(str)) {
					sortedMap.put(entry.getKey(),str);
				}
				}
			}
			
			System.out.println(sortedMap);
		}
	}
