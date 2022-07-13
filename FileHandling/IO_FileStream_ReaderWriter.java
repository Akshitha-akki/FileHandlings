package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_FileStream_ReaderWriter 
{
	public static void main(String[] args) throws IOException
	{
		String data="This line in the file of Akshitha.txt";
		FileOutputStream fis=new FileOutputStream("F:\\Akshitha.txt"); 
		byte [] array= data.getBytes();
		fis.write(array);
	  	fis.close();
	  	FileInputStream fs=new FileInputStream("F:\\Akshitha.txt");
		System.out.println("Reading the content from the file");
		int i;
		while((i=fs.read())!=-1)
		{
		 System.out.print((char)i);
		}
		fs.close();
	  	System.out.println("File Successfull");
	}

}
