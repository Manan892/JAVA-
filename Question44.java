package lab_8;
import java.io.*;

public class Question44 
{
	public static void main(String[] args) 
	{
		File f = new File("E:\\Coding things\\sdj.txt");

		try
		{
			FileReader fr = new FileReader(f);

			int ch;
			String data = "";

			while((ch = fr.read()) != -1) //Storing complete data into a string
			{
				data += (char) ch;
			}

			fr.close();

			String subdata = data.toLowerCase(); //For easy comparison making a complete lower case string 

			int firstOccur = subdata.indexOf("the");

			if(firstOccur == -1)
			{
				System.out.print("The file doesn't contain string \"the\"");
				return;
			}

			int lastOccur = subdata.lastIndexOf("the");

			if(lastOccur == firstOccur)
			{
				System.out.print("The file only contains one \"the\"");
				return;
			}
			
			String str = data.substring(firstOccur,lastOccur);
			System.out.print(str);
			
			fr.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}