
import java.io.*;
import java.util.*;

public class Easy_02{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter input: ");

    String input = obj.nextLine();
    obj.close();
    char val;
    String output = input;
    int Qcount = 0;
    String binary = "";
    int binaryIndex = 0;
    for (int i = input.length() - 1; i >= 0; i--){
      val = output.charAt(i);
      if (val == '?'){
        Qcount ++;
      }
    }
    for (int j = 0; j < Math.pow(2, Qcount); j++){
      binary = toBinary(j);
      if (binary.length() != Qcount){
        while (binary.length() != Qcount){
          binary = "0" + binary;
        }
      }
      binaryIndex = binary.length();
      output = input;
      for (int n = (input.length() - 1); n >= 0; n--){
        if(input.charAt(n) == '?'){
          binaryIndex--;
          output = output.substring(0, n) + binary.substring(binaryIndex, binaryIndex + 1) + output.substring(n + 1);
        }
      }
      System.out.println(output);
    }
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

