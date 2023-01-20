package spring;

import java.util.Map;
import java.util.HashMap;

public class MapSortByName {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		
		map.put("Ram", "IT");
		map.put("Sham", "Computer");
		map.put("Rohit", "Mechanical");
		map.put("Chetan", "HR");
		map.put("Shambhu", "Electric");
		
		System.out.println(map.get("Ram"));
		
		

	}

}
