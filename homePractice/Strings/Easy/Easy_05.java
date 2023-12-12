import java.util.*;

public class Easy_05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("String: "); 
        String inputStr=sc.nextLine();
        inputStr = inputStr.replace("\"", ""); 

        String[] array = inputStr.split(" ", -2);

        String longestWord = array[0];
        String shortestWord = array[0];

        for (int i = 1; i < array.length; i++){
            if (longestWord.length() < array[i].length()){
                longestWord = array[i];
            } else if (shortestWord.length() > array[i].length()) {
                shortestWord = array[i];
            }
        }

        System.out.print("Minimum length word: " + shortestWord + "\nMaximum length word: " + longestWord);
    }
}
