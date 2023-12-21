package homePractice.Arrays.Easy;

import java.util.stream.IntStream;

public class E_02 {
    public static void main(String[] args){
        int[] input = {10, 10, 10};
        int max = 0;
        for (int i = 0; i < input.length; i++){
            if (input[i] > max){
                max = input[i];
            }
        }
        int n = max;
        boolean contains = IntStream.of(input).anyMatch(x -> x == n);
        while(contains){
            input = removeTheElement(input, findIndex(input, max));
            contains = IntStream.of(input).anyMatch(x -> x == n);
        }
        max = 0;

        if(input.length == 0){
            System.out.print("The second largest does not exist.");
        }else {
            for (int j = 0; j < input.length; j++){
                if (input[j] > max){
                    max = input[j];
                }
            }
            input = removeTheElement(input, findIndex(input, max));
            System.out.print(max);
        }

    }

    public static int[] removeTheElement(int[] arr, int index) { 
        if (arr == null || index < 0
            || index >= arr.length) { 
  
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

    public static int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
           if (array[i] == element) {
              return i;
           }
        }
        return -1;
     }
}
