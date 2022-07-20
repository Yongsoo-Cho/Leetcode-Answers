class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int a,b;

        for(String s: tokens){
            if(s.equals("+")){
                stack.add(stack.pop()+stack.pop());
            }
            else if(stack.equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b-a);

            }
            else if(s.equals("*")){
                stack.add(stack.pop()*stack.pop());
            }
            else if(s.equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b/a);
            }
            else{
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
