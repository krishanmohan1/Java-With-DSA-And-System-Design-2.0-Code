package OOPSinJAVA;


    // ye hua user define data type
  public class Student {
    public String name;
    public int rno;
    public double percent;
    final String schoolName="Vikas vidyalaya";
    static int numOfStudent =100;  // ye static keyword hai ye ek boc banayega jo fixed rahe aur ye sabhi object esko access kar payege .
    char a;

    public static  int getNumOfStudent(){ // getter for private static num of student.
        return numOfStudent;
    }
    public Student(){  // default contructor

    }

    public Student(String name, int rno, double percent){  // contructor
        this.name=name;
        this.rno=rno;
        this.percent = percent;
        numOfStudent++;


    }

      public int getRno(){  // getter function
          return rno;
      }

      public void setRno(int n){
          rno=n;
      }

 }
