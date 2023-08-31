import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> deque = new ArrayDeque<>();

        for(String str : tokens){
            if(str.equals("*") || str.equals("+") || str.equals("/") || str.equals("-")){
                int num1 = Integer.parseInt(deque.pollLast());
                int num2 = Integer.parseInt(deque.pollLast());
            switch(str){
                case "*":
                deque.addLast(String.valueOf(num1*num2));
                break;
                case "+":
                deque.addLast(String.valueOf(num1+num2));
                break;
                case "-":
                deque.addLast(String.valueOf(num2-num1));
                break;
                case "/":
                deque.addLast(String.valueOf(num2/num1));
                break;
                
            }
            }
            else{
                
                deque.addLast(str);
            }
            
        }
        return Integer.parseInt(deque.poll());
    }
}