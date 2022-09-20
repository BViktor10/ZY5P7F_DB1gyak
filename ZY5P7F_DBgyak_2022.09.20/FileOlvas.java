package asdf124565;
import java.io.*;
import java.util.*;

public class FileOlvas
{
	public static int intOlvas(FileReader bs) throws IOException
	{
		StringBuffer sz = new StringBuffer(12);
		int b;
		do {
			b = bs.read();
			if ((char)b !=',')
				sz.append((char)b);
			else
				break;
		}while(true);
		return Integer.parseInt(sz.toString());
	}
	
	public static void main(String[] args) throws IOException
	{
		int db;
		File fajl = new File("adatok.txt");
		FileReader be_stream = new FileReader(fajl);
		
		db = intOlvas(be_stream);
		System.out.println("Adatok sz�ma = " + db);
		
		int[] x = new int[db];
		for(int i = 0; i < db; i++)
		{
			x[i] = intOlvas(be_stream);
			System.out.println(i + "adat =" + x[i]);
		}
		be_stream.close();
		
		int osszeg = 0;
		for(int i = 0; i < db; i++)
		{
			osszeg += x[i];
		}
		System.out.println("�sszeg: " + osszeg);
	}
	
	
}
