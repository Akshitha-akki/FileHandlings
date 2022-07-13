package FileHandling;

//import File Writer
import java.io.FileWriter;

public class Demo_IO_FileWriter {

	public static void main(String[] args) 
	{
		try 
		{
			//If exist it will re-write the file or create the file
			FileWriter fw=new FileWriter("F:\\Akshitha1.txt");
			//write method
		  	fw.write("Welcome to MyWorld");
		  	fw.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("File Success");
	}

}
