package Easy;
import java.util.*;

public class Easy_06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("String: "); 
        String inputStr=sc.nextLine();

        int count = 0;

        for (int i = 0; i < inputStr.length(); i++){
            for (int j = 0; j < inputStr.length(); j++){
                if (inputStr.charAt(i) == inputStr.charAt(j)){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
