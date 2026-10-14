public class Count_uppercase_and_lowercase_letters {

    public void getInput(String input){
        char[] arr=input.toCharArray();
        int countlower=0;
        int countupper=0;
        for(char letter : arr){
            if(Character.isLowerCase(letter)){
                countlower++;
            }else if(Character.isUpperCase(letter)){
                countupper++;
            }
        }
        System.out.println("Number of Lowercase characters: "+countlower);
        System.out.println("Number of Uppercase characters: "+countupper);
    }
    public static void main(String[] args){
        Count_uppercase_and_lowercase_letters obj=new Count_uppercase_and_lowercase_letters();
        obj.getInput("Java Java");
    }
}
