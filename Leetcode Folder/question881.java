class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);

        int lightest = 0;
        int heaviest = people.length-1;

        while(lightest<=heaviest){
            int sum = people[lightest] + people[heaviest];

            if(sum <= limit){
                boats++;

                lightest++;
                heaviest--;
            }
            else{
                boats++;

                heaviest--;
            }

        }
        return boats;
    }
}
