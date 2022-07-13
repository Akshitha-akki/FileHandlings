package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Demo_IO_FileReader {

	public static void main(String[] args)  throws IOException
	{
		FileReader fr;
		fr=new FileReader("F:\\Akshitha1.txt");
		System.out.println("Reading the content from the file");
		int i;
		while((i=fr.read())!=-1)
		{
		System.out.print((char)i);
		}
		fr.close();

	}

}
