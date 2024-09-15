 import java.util.Stack;

// public class Stackkk {
//  public static void main(String[] args) {
//     Stack<Integer> st=new Stack<>();
//     st.push(2);
//     st.push(3);
//     st.push(4);
//     st.push(5);
//     System.out.println(st.peek());
//     System.out.println(st.pop());
//     System.out.println(st.pop());
//     System.out.println(st);
//     System.out.println(st.pop());
//     System.out.println(st.size());

//    while(st.size()>1){
//       st.pop();
//    }
//    System.out.println(st.peek());
//    System.out.println(st.isEmpty());
//  }   
// }

// reverse stack
// public class Stackkk{
//    public static void main(String[] args) {
//       Stack<Integer> st= new Stack<>();
//          st.push(1);
//          st.push(2);
//          st.push(3);
//          st.push(4);
//          st.push(5);
//          System.out.println(st);
//          Stack<Integer> str=new Stack<>();
//          while(st.size()>0){
//             str.push(st.pop());
//          }
//          System.out.println(str); 

//          //copy
//          Stack<Integer> bb=new Stack<>();
//          while(str.size()>0){
//             bb.push(str.pop());
//          }
//          System.out.println(bb );



   

//    }
// }

// public class Stackkk{
//    public static void displays(Stack<Integer> st){
// st.push(99);
// st.push(9);

//    }
//    public static void main(String[] args) {
//       Stack<Integer> st=new Stack<>();
//       st.push(12);
//       st.push(2);
//       st.push(1);
//       st.push(2);
//       st.push(11);
//       System.out.println(st);
//       displays(st);
//       System.out.println(st);
//    }
// }

public class Stackkk{
   public static void main(String[] args) {
      Stack<Integer> st=new Stack<>();
      st.push(22);
      st.push(2);
      st.push(89);
      st.push(32);
      st.push(3);
      System.out.println(st);
      int n=st.size();
      int arr[]=new int[n];
      for(int i=n-1;i>=0;i--){
         arr[i]=st.pop();
      }
      for(int i=0;i<n;i++){
         st.push(arr[i]);
         System.out.println(arr[i]+" ");
      }
      System.out.println(st);

   }
}