package FilehandlingOrInputOutput;

import java.io.*;


public class PrintWriter9 {
    public static void main(String[] args)  throws Exception{

        File dir = new File("PW");
        File file = new File(dir,"mohan.txt");

        FileWriter fw = new FileWriter(file,true );
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("This is the println() method to write the line by line ");
        pw.print("it is the number "+ 97);
        pw.println(5.05);
        pw.print('A');

        pw.flush();
        pw.close();  // these things are compulsory


    }
}
