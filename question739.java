class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<Integer>();
        int[] res = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){

            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                res[s.peek()] = i-s.pop();
            }

            s.push(i);
        }

        return res;
    }
}


// temp [30,40,50,60]
// res [null, null, null, null]
// stack [0]

//
