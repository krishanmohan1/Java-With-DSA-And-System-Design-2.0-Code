package FilehandlingOrInputOutput;

import java.io.*;

public class ReadingFileUsingFileReader {
    public static void main(String[] args)  throws IOException{

        File dir = new File("PW");  // path always will be in the double quort
        File file = new File(dir,"mohan.txt");

        FileReader fd = new FileReader(file);
        int i =  fd.read();  // it will read and reurn the decimal value of each character inside it. so store it in int
        System.out.println(i); // to get the char value , typecasting required
        System.out.println((char)i);

        while(i!=-1)  // i!=-1 shows that , it will read until whole file get finished
        {
            System.out.print(i+" -----> "+(char)i);
            System.out.println();
//            System.out.println(i);
            i = fd.read();
        }

    }
}
