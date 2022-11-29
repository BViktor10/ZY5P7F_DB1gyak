
import java.io.*;
import java.util.Scanner;

public class SLFileIr {

    public static void main(String[] args) throws IOException
    {
        int[] data = beker();

        FileWriter fileWriter = new FileWriter(".\\AQYO8L_0920\\src\\Csomag\\viktor.txt");

        for(int i : data)
        {
            fileWriter.write(i+"\n");
        }
        fileWriter.close();

        System.out.println("Adatok kiírása a viktor.txt állományba.");

        for(int i : data)
        {
            System.out.println(i);
        }

    }

    public static int[] beker() throws IOException
    {
        Scanner reader = new Scanner(System.in);
        int db = 0;
        System.out.println("Adatok száma = ");
        db = reader.nextInt();
        
        int[] out = new int[db];
        int i = 0;
        do
        {
            System.out.println(i+".adat = ");
            int data = reader.nextInt();
            out[i] = data;
            i++;
        }while (i != db);
        reader.close();

        return out;
    }
}
