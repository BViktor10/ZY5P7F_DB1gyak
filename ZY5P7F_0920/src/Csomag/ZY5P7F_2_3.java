
import java.io.*;
import java.util.Scanner;

public class AQYO8L_2_3 {

    public static void main(String[] args) throws IOException
    {
        beker();

    }

    public static void beker() throws IOException
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kérem a fájl nevét: ");
        String fileName = reader.nextLine();

        FileWriter fileWriter = new FileWriter(fileName);

        do
        {
            System.out.println("Kérem a következő sort: ");
            String temp = reader.nextLine();
            fileWriter.write(temp+"\n");
        }
        while(!reader.nextLine().equals("end"));
        
        reader.close();
        fileWriter.close();

    }
}
