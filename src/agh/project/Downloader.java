package agh.project;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
/*
 * Klasa Downloader Ci pobiera wielow�tkowo wszystkie stronki ktore s� wpisane w 
 * plik properties. Tworzy ci osobny local_html dla kazdej z nich, wiec
 * przy parsowaniu trzeba to wziac pod uwage.
 *  
 */
public class Downloader implements Runnable{

	public static Vector<URL> Website;
	public static Boolean[] DoTry;
	//String Content;
	static Integer Timeout;
	static Integer Tries;
	Integer Instance;
	//Integer Count = 0;
	Downloader(Integer _Instance)
	{
		Instance = _Instance;
	}
	
	public void run(){
		try{
		if(DoTry[Instance])
		{
			Reader reader=null;
			InputStream stream = null;
			BufferedReader bufferedreader;
			URLConnection connection = null;
			//readSettings();
			connection = Website.get(Instance).openConnection();
			connection.setConnectTimeout(Timeout*1000);

			do{
				try{
					stream = connection.getInputStream();
				}
				catch(java.net.SocketTimeoutException A)
				{
					System.out.println("Connection Timeout "+Timeout+" "+Tries);
					Tries--;
					if (Tries==0)
					{
						return;
					}
				}
			}
			while(Tries>0 && Tries<3);
		
			//String path = "local_website"+Instance+".html";
			reader = new InputStreamReader(stream);
			bufferedreader = new BufferedReader(reader);
			//BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			String line;
			while ((line=bufferedreader.readLine())!=null)
			{
				DownloaderPool.DownloadedContent[Instance]+=line;
				//writer.write(line);
				//System.out.println(Count);
				//Count++;
				//writer.newLine();
			}
			
			
			
			
			
			//reader.close();
			//writer.close();
			return;

		}
		else
		{
			DownloaderPool.DownloadedContent[Instance]="";
		}
		}
			catch(java.net.UnknownHostException A){
				System.out.println("Unknown website");
				return;
			}
			catch(IOException a)
			{
				return;
			}
		

	}
	
	public static void readSettings()
	{
		Website = new Vector<URL>();
		File properties = new File("src/agh/project/properties.txt");
		Scanner read=null;
		try
		{
			
			read = new Scanner(properties);
			String line;
			while ( read.hasNext())
			{

				line = read.nextLine();
				if (line.startsWith("url"))
				{
					Website.add(new URL(line.substring("url".length()+1)));
				}
				else if (line.startsWith("timeout"))
				{
					Timeout = new Integer(line.substring("timeout".length()+1));
				}
				else if (line.startsWith("try"))
				{
					Tries = new Integer(line.substring("try".length()+1));
				}
			    //System.out.println(line);
			}	
			//System.out.println(Website.elementCount);
			read.close();
		}
		catch (java.net.MalformedURLException A)
		{
			System.out.println("Malformed URL");
		}
		catch (FileNotFoundException A){
			System.out.println("File not found");
		}
		catch (java.util.NoSuchElementException A){
			read.close();
		}

	}


}
