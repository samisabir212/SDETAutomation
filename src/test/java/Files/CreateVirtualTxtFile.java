package Files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateVirtualTxtFile {
	
	
	public static void main(String[] args) throws IOException 
	{
	    File f=File.createTempFile("temp", ".txt");
	    f.createNewFile();
	    FileOutputStream fos=new FileOutputStream(f);
	    
	    PrintWriter out = new PrintWriter(f);
		out.println("Request:");
		out.close();
//	    fos.write(128);
//	    fos.write(111);
//	    fos.flush();
	    //  printFile(f);
	 
	    if(fos!=null)
	    {
	        fos.close();
	    }
	    printFile(f);       
	}
	 
	public static void printFile(File f) throws IOException 
	{
	    FileInputStream fis=new FileInputStream(f);
	    DataInputStream dis=new DataInputStream(fis);
	    String line=dis.readLine();
	    while(line!=null)
	    {
	        System.out.println(line);
	        line=dis.readLine();;
	    }
	}

}
