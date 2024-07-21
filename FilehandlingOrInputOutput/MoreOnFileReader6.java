package FilehandlingOrInputOutput;
import java.io.*;

public class MoreOnFileReader6 {
    public static void main(String[] args) throws IOException{

        File dir = new File("PW");
        File file = new File(dir,"mohan.txt");

        FileReader fd = new FileReader(file);

//       int i =  fd.read(); baar baar karna is not good practice

        char ch [] = new char[(int)file.length()];

        fd.read(ch);    //  yaha file ko read karke , ch array me store kar liye

        for(char data : ch){
            System.out.print(data);
        }

    }
}
