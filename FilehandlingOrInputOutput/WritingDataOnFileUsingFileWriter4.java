package FilehandlingOrInputOutput;
import java.io.*;

        // To write some thing on file we use file writter .


public class WritingDataOnFileUsingFileWriter4 {
    public static void main(String[] args) throws IOException {

        File dir = new File("PW");
        File file = new File(dir,"mohan.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file,true);  // yaha default me false rehta hai jisse , file overwrite hota hai
        fw.write("Java PW skill");
        fw.write("\n"); // esse line change hota hai
 //        System.out.println();    esse line change nhi hoota hai
        fw.write("MOhan BAba");
        fw.write("\n");
        fw.write(97);   // ye ASCII code me character store karega/ write karega
        fw.write("\n");
        char ch[] = {'A','B','C','D'};
        fw.write(ch);
        fw.write("\n");
        fw.close();  // ye close nhi karoge to write nhi hoga

        System.out.println("Open the file pw.txt to see the result");
        // ye sab console me print nhi hota hai.
    }
}
