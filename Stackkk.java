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
public class Stackkk{
   public static void main(String[] args) {
      Stack<Integer> st= new Stack<>();
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);
         st.push(5);
         System.out.println(st);
         Stack<Integer> str=new Stack<>();
         while(st.size()>0){
            str.push(st.pop());
         }
         System.out.println(str); 

         //copy
         Stack<Integer> bb=new Stack<>();
         while(str.size()>0){
            bb.push(str.pop());
         }
         System.out.println(bb);



   

   }
}