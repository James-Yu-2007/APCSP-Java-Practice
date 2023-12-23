package homePractice.Arrays.Easy;

import java.util.Arrays;

public class E_03 {
    public static void main(String[] args){
        int[] input = {1, 2, 0, 4, 3, 0, 5, 0};

        for (int i = 0; i < input.length; i++){
            if (input[i] == 0){
                input = removeTheElement(input, i);
                input = addElement(input.length, input, 0);
            }
        }
        System.out.println(Arrays.toString(input));
        
    }

    public static int[] removeTheElement(int[] arr, int index) { 
        if (arr == null || index < 0 || index >= arr.length) { 
  
            return arr; 
        } 
        int[] anotherArray = new int[arr.length - 1]; 
        for (int i = 0, k = 0; i < arr.length; i++) { 
            if (i == index) { 
                continue; 
            } 
            anotherArray[k++] = arr[i]; 
        } 
        return anotherArray; 
    }

    public static int[] addElement(int n, int myarray[], int ele) 
    { 
         int i; 
 
         int newArray[] = new int[n + 1]; 
        for (i = 0; i < myarray.length; i++) 
              newArray[i] = myarray[i]; 
 
        newArray[n] = ele; 
 
        return newArray; 
    } 
}
