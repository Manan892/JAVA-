package lab_8;
import java.io.*;

public class Question47 {
	public static void main(String[] args) {
		File f = new File("E:\\Coding things\\sdj.txt");
		try {
			FileReader fr = new FileReader(f);
			int ch;
			String str = "";
			
			while((ch=fr.read())!=-1)
				str += (char)ch;
			
			fr.close();
			String tokens[] = str.split(" ");
			
			FileWriter fw = new FileWriter(f);
			for(String l: tokens) {
				if(l.length()>0)
					fw.write(Character.toUpperCase(l.charAt(0)) + l.substring(1) + " ");
			}
			
			fw.close();
		}
		catch(IOException ex) {
			ex.getMessage();
		}
	}
}