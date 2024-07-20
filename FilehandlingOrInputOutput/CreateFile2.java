package FilehandlingOrInputOutput;

import java.io.*;

public class CreateFile2 {
    public static void main(String[] args) throws IOException {

        // to create file
        File file1 = new File("pw.txt");  // in the paraenthesis there will be the path name , where would be the file
        System.out.println(file1.exists());


        file1.createNewFile();    // this is show that it will give exception so to handel it you can throw the exception
        // In this a new  Directory  will be created there .i.e, in the Pw_Skill_Java
        System.out.println(file1.exists());


        // To create a new Directory


        File dir = new File("PW");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());






    }
}
