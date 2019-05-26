package edu.handong.analysis.utils;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.io.File;
import java.io.FileWriter;



public class Utils {
		
		public static ArrayList<String> getLines(String file, boolean removeHeader){
			ArrayList<String> lines = new ArrayList<String>();
			
			if(removeHeader)
				lines.remove(0);
			try {
				String line ="";
				BufferedReader br = new BufferedReader(new FileReader(file));
				while ((line = br.readLine()) != null) { 
					lines.add(line);
				} 
			br.close();
			} catch (FileNotFoundException e) {
					System.out.println(e);
			}catch (IOException e) {
				System.out.println(e);
			}

			return lines;
			}
		
		public static void wirteAFile(ArrayList<String>lines, String targetFileName) {
			File file = new File(targetFileName);
			Writer fileWriter = null;
			BufferedWriter bufferedWriter = null;
				
			try {
				fileWriter = new FileWriter(file);
	            bufferedWriter = new BufferedWriter(fileWriter);
	            
	            for (String line : lines) {
	            	 bufferedWriter.write(line);
	            }
			} catch (IOException e) {
	            System.out.println("Error writing the file : ");
	            e.printStackTrace();
		}

}
}