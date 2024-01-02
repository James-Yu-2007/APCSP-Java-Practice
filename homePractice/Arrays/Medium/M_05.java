package homePractice.Arrays.Medium;

import java.util.Scanner;

public class M_05 {
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);  
    System.out.print("input: "); 
    String inputStr=sc.nextLine();
    sc.close();
    inputStr = inputStr.replace(" ", ""); 
    inputStr = inputStr.replace("{", ""); 
    inputStr = inputStr.replace("}", ""); 
    String[] input = inputStr.split("=", -2);
    String[] arr = input[1].split(",", -2);
    int n = arr.length; 
    System.out.println(countRotations(arr, n)); 
  } 

  static int countRotations(String arr[], int n) { 
    if (Integer.valueOf(arr[0]) > Integer.valueOf(arr[n - 1])) { 
      for (int i = 0; i < n; i++) { 
        if (Integer.valueOf(arr[i]) > Integer.valueOf(arr[i + 1])) 
          return i + 1; 
      } 
    } 
    return 0; 
  } 
}

