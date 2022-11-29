
import java.io.*;
import java.util.Scanner;

public class SLFileOlvas {

    public static void main(String[] args) throws IOException
    {
        int[] db;
        int sum = 0;
        File file = new File(".\\AQYO8L_0920\\src\\Csomag\\viktor.txt");

        db = intOlvas(file);

        System.out.println("Adatok száma: "+db.length);

        for( int i = 0; i < db.length; i++)
        {
            System.out.println(i+".adat:"+db[i]);
            sum += db[i];
        }

        System.out.println("Összeg: "+sum);
    }

    public static int[] intOlvas(File file) throws IOException
    {
        int[] out = new int[2];
        int i = 0;
        Scanner reader = new Scanner(file);

        do
        {
            String data = reader.nextLine();
            out[i] = Integer.parseInt(data);
            i++;
        }while (reader.hasNextLine());
        reader.close();

        return out;
    }
}
