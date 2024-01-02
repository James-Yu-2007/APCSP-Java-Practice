package homePractice.Arrays.Medium;

import java.util.Arrays;

public class M_01 {
    public static void main(String[] args){
        int[] input = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] output = {};
        
        int length = input.length;
        for (int i = 0; i < length; i++){
            if (contains(input, i)){
                output = addElement(output.length, output, i);
                input = removeElement(input, i);
            } else{
                output = addElement(output.length, output, -1);
            }
        }

        System.out.print(Arrays.toString(output));
    }

    public static boolean contains(int[] input, int num){
        for (int i = 0; i < input.length; i++){
            if (input[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int[] removeElement(int[] arr, int index) { 
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

    public static int[] addElement(int n, int myarray[], int ele) { 
         int i; 
 
         int newArray[] = new int[n + 1]; 
        for (i = 0; i < myarray.length; i++) 
              newArray[i] = myarray[i]; 
 
        newArray[n] = ele; 
 
        return newArray; 
    } 
}
