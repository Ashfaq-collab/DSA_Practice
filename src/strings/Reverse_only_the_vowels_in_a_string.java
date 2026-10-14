public class Reverse_only_the_vowels_in_a_string {
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
                ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public void getInput(String input) {
        char[] arr = input.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            while(l<r&!isVowel(arr[l])){
                l++;
            }
            while(l<r&!isVowel(arr[r])){
                r--;
            }
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        StringBuilder result=new StringBuilder();
        for(char letter:arr){
            result.append(letter);
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        Reverse_only_the_vowels_in_a_string obj=new Reverse_only_the_vowels_in_a_string();
        obj.getInput("LeetCode");
    }
}
