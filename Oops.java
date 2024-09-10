 class Student{
    int rollno;
    String name;
    static String clzname="ssmc";

    Student(int r, String n){
        this.rollno=r;
        this.name=n;
    }
    void display(){
        System.out.println(rollno +" "+name+" "+clzname);
    }
 }


public class Oops {
    // 
    
    final public static void main(String...args){
Student s1=new Student(2, "Binita rijal");
Student s2=new Student(3, "kriti");
s1.display();
s2.display();
    }
}
