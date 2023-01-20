package spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map= new HashMap<>();
		map.put("Akash" , "Computer");
		map.put("Sai" , "IT");
		map.put("Sham" , "Mechanical");
		map.put("Radha" , "Computer");
		map.put("Krishn" , "IT");
		
		System.out.println("Befort sort map is:" +map);
		
		List<String> sort = new ArrayList <String>(map.keySet());
		Collections.sort(sort);
		System.out.println("After sort list is:" +sort);
		
		
		for (Entry<String, String> entry : map.entrySet())
		{
			if(entry.getValue().equals("IT"))
			{
				System.out.println("key value list as IT department::"+entry.getKey());
		
		}
			if(entry.getValue().equals("Mechanical"))
			{
				System.out.println("key value list as Mechanical department::"+entry.getKey());
				
			}

		}
		
		
		}

}
