package strings;

public class swap {
    public static void main(String args[]){
        String input="Ashfaq"; //sAfhqa
        char[] arr=input.toCharArray();
        int l=0;
        int r=1;
        while(r< arr.length){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            l++;
            r++;
            r++;
        }
        StringBuilder result=new StringBuilder();
        for(char i:arr){
            result.append(i);
        }
        System.out.println(result);

    }
}
