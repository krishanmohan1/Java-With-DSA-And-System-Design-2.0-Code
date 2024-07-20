package FilehandlingOrInputOutput;

// To create the file and directory , file inside the directory, Counting the no. of files inside the folder and printing the name iif it.

import java.io.*;


public class MoreOnCreateFile3  {
    public static void main(String[] args) throws IOException {
//        File dir = new File("PWJAVA");  // yaha jis loaction me file banwana chahate ho wo bhi banwa sate ho.
//        System.out.println(dir.isDirectory());
//
//        dir.mkdir();
//        System.out.println(dir.isDirectory());
//
//        File file = new File(dir,"pw.txt");
//        System.out.println(file.isFile());
//
//        file.createNewFile();
//        System.out.println(file.isFile());
//
//        // to read the no. of file in inside a Directory, use list() method.
//        // list() return an Array Of String Containg the name of files in it
//        int count = 0;
//
//
//        File f = new File("C://Users//krish//OneDrive//Desktop//Assignments/");  // here f is refering the folder pw_skill_java
//
//        String str[] = f.list();   // here str is an array holing the files of the directory pw_skill_java
//
//
//        for(String name : str ){
//            count++;
//            System.out.println(name);
//        }
//        System.out.println("no of files are "+ count);

        // self

        File dir2 = new File("C://Users//krish//OneDrive//Desktop//FileBy java IO/");
        System.out.println(dir2.isDirectory());
        dir2.mkdir();
//        System.out.println(dir2.isDirectory());

        File f1 = new File(dir2,"mohan.txt");
        System.out.println(f1.isFile());
        f1.createNewFile();
        System.out.println(f1.isFile());

        int c = 0;
        String st[] = dir2.list();
        for(String name : st){
            c++;
            System.out.println(name);
        }
        System.out.println(c);





    }
}
