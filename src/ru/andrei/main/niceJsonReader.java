package ru.andrei.main;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class niceJsonReader {

	public static void main(String[] args)
	{
		JSONParser parser = new JSONParser();
		
		 try {

			 Object obj = parser.parse(new FileReader("f:\\test.json"));

	         JSONObject jsonObject = (JSONObject) obj;
	         System.out.println(jsonObject);

	         String name = (String) jsonObject.get("name");
	         System.out.println(name);

	         long age = (Long) jsonObject.get("age");
	         System.out.println(age);
	         if(age == 17)
	         {
	        	 System.out.println("yes !");
	         } else 
	         {
	        	 System.out.println("nop!");
	         }
	         JSONArray msg = (JSONArray) jsonObject.get("messages");
	         Iterator<String> iterator = msg.iterator();
	         while (iterator.hasNext()) {
	                System.out.println(iterator.next());
	         }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}
	
}
