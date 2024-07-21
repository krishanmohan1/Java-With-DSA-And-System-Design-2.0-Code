package FilehandlingOrInputOutput;
import java.io.*;

public class BufferedReader8 {
    public static void main(String[] args) throws Exception {

        File dir = new File("Pw");
        File file = new File(dir,"mohan.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();  // readLine() method poora line ko read karke return karti hai String , read() method ascii decimal value return karta hai

        while(line!=null)    // null es liye kyu ki , jab read karte line khatam ho jayega to string me null he kehte hai na
        {
            System.out.println(line);
            line = br.readLine();

        }


    }
}
