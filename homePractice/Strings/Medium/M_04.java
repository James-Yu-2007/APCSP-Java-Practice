package Medium;

import java.util.*;

public class M_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("Input: "); 
        String inputStr=sc.nextLine();
        inputStr = inputStr.substring(inputStr.indexOf("\"") + 1, inputStr.length() - 1); 
        sc.close();

        String str1 = "";
        String str2 = "";
        String tempStr = "";
        int count = 0;
        String[] array = {};

        for (int i = 1; i < inputStr.length(); i++){
            for (int j = 0; j <= (inputStr.length() - i); j++){
                for (int k = 0; k < i; k++){
                    tempStr += inputStr.charAt(j+k);
                }
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = tempStr;
                tempStr = "";
            }
            tempStr = "";
        }
        for (int n = 0; n < array.length; n++){
            str1 = array[n];
            for (int m = n + 1; m < array.length; m++){
                str2 = array[m];
                if (areAnagram(str1.toCharArray(), str2.toCharArray())){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    static boolean areAnagram(char[] str1, char[] str2){
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
}
