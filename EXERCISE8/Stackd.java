import java.util.*;

class Stackd{
        
        public static void main(String args[]){
                Stack<Integer>stack=new Stack<Integer>();
                stack.push(20);
                stack.push(40);
                stack.push(60);
                stack.push(80);
                stack.push(100);
                
                System.out.println("Size of the stack "+stack.size());
                System.out.println("Contents in the stack "+stack);
                
                stack.removeElementAt(2);
                System.out.println("Contents in the Stack after remove at index 2:"+stack);
                }
}

/**
OUTPUT
------
Size of the stack 5
Contents in the stack [20, 40, 60, 80, 100]
Contents in the Stack after remove at index 2:[20, 40, 80, 100]
*/
