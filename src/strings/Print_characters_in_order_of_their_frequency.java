import java.util.*;

public class Print_characters_in_order_of_their_frequency {

    public void getInput(String input){
        char[] arr= input.toCharArray();
        Map<Character, Integer> freq=new HashMap<>();
        for(char letter: arr){
            freq.put(letter, freq.getOrDefault(letter,0)+1);
        }
        List<Map.Entry<Character,Integer>> entrylist=new ArrayList<>(freq.entrySet());
        entrylist.sort((a,b)->a.getValue().compareTo(b.getValue()));
        System.out.println(entrylist);
    }
    public static void  main(String args[]){
        Print_characters_in_order_of_their_frequency obj=new Print_characters_in_order_of_their_frequency();
        obj.getInput("Mississippi");
    }
}
