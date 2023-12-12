package Medium;
import java.util.*;

public class M_01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("String: "); 
        String inputStr=sc.nextLine();
        inputStr = inputStr.replace(" ", ""); 

        String[] array = inputStr.split(",", -2);
        int k = Integer.valueOf(array[1].substring(array[1].indexOf("=") + 1));

        int count = 0;
        boolean success = false;

        for (int i = 0; i < array[0].length(); i++){
            for (int j = 0; j < array[0].length(); j++){
                if (j != i){
                    if (array[0].charAt(i) == array[0].charAt(j)){
                        break;
                    } else if (j == array[0].length() - 1){
                        count++;
                    }
                }
            }
            if (count == k){
                System.out.print(array[0].charAt(i));
                success = true;
                break;
            }
        }
        if (!success){
            System.out.print("Less than k non-repeating characters in input.");
        }
    }
}
