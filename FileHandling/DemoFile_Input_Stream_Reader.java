package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class DemoFile_Input_Stream_Reader 
{
	public static void main(String[] args)throws IOException 
	{
		FileInputStream fs=new FileInputStream("F:\\Akshitha.txt");
		System.out.println("Reading the content from the file");
		int i;
		while((i=fs.read())!=-1)
		{
		 System.out.print((char)i);
		}
		fs.close();
	}

}
