class Solution {
    public static int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        for(String n : tokens) {

            

           if(n.equals("*") || n.equals("+") || n.equals("-") || n.equals("/")) {

                int top = stack.pop();
                int underneath = stack.pop();
              
                int totalAmount = switch (n) {
                case "+" -> underneath + top;
                case "-" -> underneath - top;
                case "*" -> underneath * top;
                case "/" -> underneath / top;
                    default -> 0; 
                };
            
                    stack.push(totalAmount);
                
        

            }
            else{
                stack.push(Integer.parseInt(n));
                
            }


           

        }
        
        return stack.pop();
    }
}
