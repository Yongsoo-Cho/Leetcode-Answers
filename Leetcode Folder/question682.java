class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;

        for(String round: ops){
            if("C".equals(round)){
                stack.pop();
            }
            else if("D".equals(round)){
                stack.push(2*stack.peek());
            }
            else if("+".equals(round)){
                int oneBefore = stack.pop();
                int twoBefore = oneBefore + stack.peek();
                stack.push(oneBefore);
                stack.push(twoBefore);
            }
            else{
                stack.push(Integer.parseInt(round));
            }
        }

        while(!stack.isEmpty()){
            res += stack.pop();
        }

        return res;
    }
}
