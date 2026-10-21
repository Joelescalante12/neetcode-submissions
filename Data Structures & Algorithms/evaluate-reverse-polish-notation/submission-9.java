class Solution {
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        //int totalAmount = 0;
        for(String n : tokens) {

            //int num = 0;

            if(!n.equals("*") && !n.equals("+") && !n.equals("-") && !n.equals("/")) {
                int num = Integer.parseInt(n);
                stack.push(num);
            }

            if(n.equals("*") || n.equals("+") || n.equals("-") || n.equals("/")) {

                /*
                int result = switch (n) {
                    case "+" -> b + a;
                    case "-" -> b - a;
                    case "*" -> b * a;
                    case "/" -> b / a;
                    default -> 0; // or handle it if needed
                };
                */


                int top = stack.pop();
                int underneath = stack.pop();
                System.out.println("a" + underneath);
                int totalAmount = switch (n) {
                case "+" -> underneath + top;
                case "-" -> underneath - top;
                case "*" -> underneath * top;
                case "/" -> underneath / top;
                    default -> 0; // or handle it if needed
                };
                //if(totalAmount > 0) {
                    stack.push(totalAmount);
                //}
            


            }


            
            //if(num > 0) {
               // stack.push(num);
            //}

        }
        
        return stack.pop();
    }
}
