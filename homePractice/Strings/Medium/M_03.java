package Medium;

import java.util.*;

public class M_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("Input: "); 
        String inputStr=sc.nextLine();
        inputStr = inputStr.replace("\"", ""); 

        String[] array = inputStr.split(",", -2);
        int strLength = Integer.valueOf(array[1].substring(1));
        String string = array[0].substring(0, strLength);
        string = string.replace(" ", "%20"); 

        System.out.print("Output: " + string);
    }
}
