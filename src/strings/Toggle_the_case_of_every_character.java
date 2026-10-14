public class Toggle_the_case_of_every_character {
    public void getInput(String input){
        char[] arr=input.toCharArray();
        int index=0;
        for(char letter:arr){
            if(Character.isLowerCase(letter)){
                arr[index]=(char) (letter-32);
                index++;
            }else{
                arr[index]=(char) (letter+32);
                index++;
            }
        }
        StringBuilder result=new StringBuilder();
        for(char letter: arr){
            result.append(letter);
        }
        System.out.println("Case Toggled String: "+result);
    }
    public static void main(String args[]){
        Toggle_the_case_of_every_character obj = new Toggle_the_case_of_every_character();
        obj.getInput("JaVa");
    }
}
