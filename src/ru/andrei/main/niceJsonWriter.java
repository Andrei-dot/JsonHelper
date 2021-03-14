package ru.andrei.main;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class niceJsonWriter {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		JSONObject obj = new JSONObject();
		
		obj.put("name", "andrei");
		obj.put("age", new Integer(16));
	
		JSONArray list = new JSONArray();
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");

		obj.put("messages", list);
		
		 try (FileWriter file = new FileWriter("f:\\test.json")) {

	            file.write(obj.toJSONString());
	            file.flush();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.print(obj);
	}
}
