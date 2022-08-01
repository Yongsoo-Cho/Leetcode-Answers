class Solution {
    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length()-1;
        char[] word = s.toCharArray();

        while(left<right){
            if(!isVowel(word[left])){ left++; }
            if(!isVowel(word[right])) { right--; }

            if(isVowel(word[left]) && isVowel(word[right])){
                swap(left, right, word);

                left++;
                right--;
            }
        }

        return String.valueOf(word);
    }


    public void swap(int i, int j, char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c =='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
