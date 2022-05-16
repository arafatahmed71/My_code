package fileio; 
import java.io.*; 

public class FileReadWrite {

private File file;				
	private FileWriter writerFresher ;	
	private FileWriter writerExperienced;
	private FileReader readerFresher ;	
	private FileReader readerExperienced;		
	private BufferedReader bfr;		
	
	
	public void writeInFileFresher(String f)
	{
		
		try
		{
			file = new File("fileio/Fresher History.txt");	
			file.createNewFile();					
			writerFresher = new FileWriter(file, true);
			writerFresher.write(f+"\r"+"\n");				
			writerFresher.flush();							
			writerFresher.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void writeInFileExperienced(String e)
	{
		
		try
		{
			file = new File("fileio/Experirnced History.txt");	
			file.createNewFile();					
			writerExperienced = new FileWriter(file, true);
			writerExperienced.write(e+"\r"+"\n");				
			writerExperienced.flush();							
			writerExperienced.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFileFresher()
	{
		
		try
		{
			readerFresher = new FileReader(file);			
			bfr = new BufferedReader(readerFresher);	
			String text="", temp;					
			
			while((temp=bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.println(text);			
			readerFresher.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	
	public void readFromFileExperienced()
	{
		
		try
		{
			readerExperienced = new FileReader(file);			
			bfr = new BufferedReader(readerExperienced);	
			String text="", temp;					
			
			while((temp=bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.println(text);			
			readerExperienced.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}