package lab_8;
import java.io.*;
import java.util.*;

public class Question46 {
	public static void main(String[] args) {
		File f = new File("E:\\Coding things\\names.txt");
		try {
			
			ArrayList<String> lines= new ArrayList<>(); 		//Storing all the lines here
			
			FileReader fr = new FileReader(f);					//File reading object to allow read
			
			int ch;												//integer to check if file is over or not
			String line="";										//Storing each line
			
			while((ch=fr.read())!=-1) 
			{
				if((char)ch=='\n')    		//If the next line character is encountered storing string after removing first 3 character
				{
					if(line.length()>3)						
						line = line.substring(3);
					
					else
						line = "";
					
					lines.add(line);     //Adding line to array list
					line = "";           //Making string empty again for next line
					
				}
				else 						//Else updating line
				{
					line += (char)ch;
				}
				
			}
			if(line.length()>0) 			//The remaining last line
			{
				if(line.length()>3) 
					line = line.substring(3);
				else
					line = "";
				lines.add(line);
			}
			fr.close();
			
			int n = lines.size();
			for(int i=0;i<n-1;i++) 			//Sorting in arraylist of string via collection swap while comparing string via compareTo
			{
				for(int j=i+1;j<n;j++) 
				{
					if(lines.get(i).compareTo(lines.get(j))>0) 
						Collections.swap(lines, i, j);
				}
			}

			FileWriter fw = new FileWriter(f);	// Writing the Final arraylist into file
			for(String l : lines)     
				fw.write(l + "\n");
			fw.close();
		} 
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
