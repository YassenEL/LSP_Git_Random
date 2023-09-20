package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Assignment_2 {

	public static void main(String[] args) {
		FileReader filename = new FileReader(); //Uses The FileReader class to read the file
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		try {
			String filepath = filename.readToString("main/java/resources/words.txt");// FilePath 
			System.out.println(filepath);
			String[] seperated = filepath.toLowerCase().split(" ");//This removes all non-characters such as spaces
			for (int x = 0; x < seperated.length; x++) {// Separating the file itself
				if (seperated[x].length() > 3) { 
					if (hashmap.get(seperated[x]) == null) {
						hashmap.put(seperated[x], 1); //setting number of occurrences to 1
					}
					else {
						hashmap.put(seperated[x], hashmap.get(seperated[x]) + 1);//increasing number of times it occurs
					}
				}
			}
			for (String i : hashmap.keySet()) {// printing each hashmap key
				System.out.println(i + " " + hashmap.get(i));
			}
		}
		catch (FileNotFoundException e) {//Catchers any error's or exceptions found
			System.out.println("File not found in directory");
		}

	}

}
