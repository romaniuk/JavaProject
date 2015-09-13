package agh.project;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Downloader {
	
	static String Name;
	static URL Website;
	static Integer Timeout;
	static Integer Tries;
	
	public static String download() throws IOException{
		try{
		Reader reader=null;
		InputStream stream = null;
		BufferedReader bufferedreader;
		URLConnection connection = null;
		String content = null, tmp = null;
		//readSettings();
		connection = Website.openConnection();
		connection.setConnectTimeout(Timeout*1000);

		do{
			try{
				stream = connection.getInputStream();
			}
			catch(java.net.SocketTimeoutException e)
			{
				Log4j.log.error("Connection Timeout "+Timeout+" "+Tries);
				Log4j.log.error(e, e);
				Tries--;
				if (Tries==0)
				{
					return"";
				}
			}
		}
		while(Tries>0 && Tries<3);
	
		String path = Name+".html";
		reader = new InputStreamReader(stream);
		bufferedreader = new BufferedReader(reader);
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		String line;
		while ((line=bufferedreader.readLine())!=null)
		{
			writer.write(line);
			writer.newLine();
		}
		reader.close();
		writer.close();
		return path;
		}
		catch(java.net.UnknownHostException e){
			Log4j.log.error("Unknown website");
			Log4j.log.error(e, e);
			return "";
		}
	}
	
	public static void readSettings() throws IOException
	{
		File properties = new File("src/agh/project/properties.txt");
		Scanner read=null;
		try
		{
			read = new Scanner(properties);			
			String line;
			int i=0;
			while ((line = read.nextLine())!=null)
			{			
				if (line.startsWith("***"))
				{
					Name = line.substring("***".length(),line.length()-3);
					line = read.nextLine();
					Website = new URL(line.substring("url".length()+1));
					line = read.nextLine();
					Timeout = new Integer(line.substring("timeout".length()+1));
					line = read.nextLine();
					Tries = new Integer(line.substring("try".length()+1));
					download();
					i++;
				}
			}	
		}
		catch (java.net.MalformedURLException e)
		{
			Log4j.log.error("Malformed URL");
			Log4j.log.error(e, e);
		}
		catch (FileNotFoundException e){
			Log4j.log.error("File not found");
			Log4j.log.error(e, e);
		}
		catch (java.util.NoSuchElementException e){
			//Log4j.log.error(e, e);
			read.close();
		}

	}
	
}
