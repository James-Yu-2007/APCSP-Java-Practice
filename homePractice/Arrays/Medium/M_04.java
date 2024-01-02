package homePractice.Arrays.Medium;

import java.util.*;

public class M_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("input: "); 
        String inputStr=sc.nextLine();
        sc.close();
        inputStr = inputStr.replace(" ", ""); 
        inputStr = inputStr.replace("{", ""); 
        inputStr = inputStr.replace("}", ""); 
        String[] input = inputStr.split("=", -2);
        input[1] = input[1].substring(0, input[1].length() - 4);
        String[] strArr = input[1].split(",", -2);

        boolean found = false;
        for (int i = 0; i < strArr.length; i++){
            if (strArr[i].equals(input[2])){
                System.out.print("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.print("Not found");
        }
    }
}
