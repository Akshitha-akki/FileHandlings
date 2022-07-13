package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFile_Output_Stream_Writer {

	public static void main(String[] args)throws IOException
	{
		 
		String data="This line in the file";
		FileOutputStream fis=new FileOutputStream("F:\\Akshitha.txt"); 
		byte [] array= data.getBytes();
		fis.write(array);
	  	fis.close();
	  	System.out.println("File Successull");
	}
}
