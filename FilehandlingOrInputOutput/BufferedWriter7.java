package FilehandlingOrInputOutput;
import java.io.*;


public class BufferedWriter7 {
    public static void main(String[] args)  throws IOException {

        File dir = new File("PW");
        File file = new File(dir,"mohan.txt");

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("I am Software Developer");
        bw.newLine();

        bw.write("Aiming 15+ lakh placements");
        bw.newLine();

        bw.flush();     // ye karne se har haal me file write hoga he
        bw.close();  // ye karne se resource close ho jayega jisse , ki write ho jayega

        System.out.println("open file to see result.");


    }

}
