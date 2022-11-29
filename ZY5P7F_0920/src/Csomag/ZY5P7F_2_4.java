

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AQYO8L_2_4 {

    public static void main(String[] args) throws IOException
    {
        beOlvas();
    }

    public static void beOlvas() throws IOException
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kérem a fájl nevét: ");
        String fileName = reader.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = br.readLine()) != null) 
        {
            System.out.println(line.toUpperCase());
        }

        reader.close();
        br.close();

    }
    
}
