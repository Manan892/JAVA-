package lab_8;
import java.io.*;
import java.util.List;

public class Question45 
{
	public static void main(String[] srgs) 
	{
		File f = new File("E:\\Coding things\\sdj.txt");
		try 
		{
			FileReader fr = new FileReader(f);
			int ch;
			int i=0;
			while((ch=fr.read())!=-1) {
				if((char)ch=='a' || (char)ch=='A' || (char)ch=='e' || (char)ch=='E' || (char)ch=='i' || (char)ch=='I' || (char)ch=='o' || (char)ch=='O' || (char)ch=='u' || (char)ch=='U')
					System.out.println((char)ch + " :- " + i);
				i++;
			}

			fr.close();
		}
		catch(IOException ex)
		{
			ex.getMessage();
		}
	}
}
