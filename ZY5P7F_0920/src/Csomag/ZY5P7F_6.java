import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AQYO8L_2_6 implements Serializable {

    private static final long serialVersionUID = 1L; 
    String rsz; 
    String tipus; 
    int ar;
    public static void main(String[] args) throws IOException
    {
        makeCars();
    }


    public AQYO8L_2_6 (String r, String t, int a)
    {
        this.rsz = r; 
        this.tipus = t; 
        this.ar = a;
    }

    public static void makeCars () throws IOException
    {
        AQYO8L_2_6[] autoim = {new AQYO8L_2_6("R11", "Opel",333),new AQYO8L_2_6("R12", "Fiat",233),new AQYO8L_2_6("R14", "Skoda",364)};
        ObjectOutputStream kifile = new ObjectOutputStream(new FileOutputStream ("Autok.dat"));
        for (AQYO8L_2_6 auto: autoim) 
        {
            kifile.writeObject(auto);
            kifile.close();
            System.out.println ("OK");
        }
    }
}
