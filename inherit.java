class A{
    void pp(){
        System.out.println("hello A");
    }
    A(){

    };
}
class B extends A{
    void pp(){
        System.out.println("Hello B");
    }
    B(){

    };
}

public class inherit {
    public static void main(String[] args) {
     A b1=new B();
     b1.pp();   
    }
}
