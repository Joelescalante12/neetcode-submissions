class Solution {
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for(String n : tokens) {

            

            if(!n.equals("*") && !n.equals("+") && !n.equals("-") && !n.equals("/")) {
                int num = Integer.parseInt(n);
                stack.push(num);
            }

            if(n.equals("*") || n.equals("+") || n.equals("-") || n.equals("/")) {


                int top = stack.pop();
                int underneath = stack.pop();

                int totalAmount = switch (n) {
                case "+" -> underneath + top;
                case "-" -> underneath - top;
                case "*" -> underneath * top;
                case "/" -> underneath / top;
                    default -> 0; // or handle it if needed
                };
                
                    stack.push(totalAmount);
                
            


            }


           

        }
        
        return stack.pop();
    }
}
