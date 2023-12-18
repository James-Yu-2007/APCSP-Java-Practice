package Easy;

import java.io.*;
import java.util.*;

public class Easy_01{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter input: ");
        int input = obj.nextInt();
        obj.close();

        int n = 2;
        String binaryStr;
        int count = 0;
        int returnCount = 0;
        char val;
        double max = Math.pow(2, input);
        int intMax = (int)max;

        while (n <= input){
            for (int i = intMax/2; i < intMax; i++){
                binaryStr = toBinary(i);
                for (int j = 0; j < binaryStr.length(); j++){
                    val = binaryStr.charAt(j);
                    if (val == '1'){
                        count++;
                        if (count == n){
                            returnCount++;
                            break;
                        }
                    } else {
                        count = 0;
                    }
                }
                count = 0;
            }
            n++;
        }
        System.out.print(returnCount);
    }
    public static String toBinary(int decimal){    
        int binary[] = new int[40];    
        int index = 0; 
        String returnVal = "";
        while(decimal > 0){    
          binary[index++] = decimal%2;    
          decimal = decimal/2;  
        }    
        for(int i = index-1;i >= 0;i--){    
          returnVal += binary[i];    
        }    
       return returnVal;
     }   
}