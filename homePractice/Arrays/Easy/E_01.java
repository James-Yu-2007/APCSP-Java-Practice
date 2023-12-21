package homePractice.Arrays.Easy;

public class E_01 {
    public static void main(String[] args){
        int[] input = {10, 4, 3, 50, 23, 90};
        int max = 0;
        for (int i = 0; i < input.length; i++){
            if (input[i] > max){
                max = input[i];
            }
        }
        input = removeTheElement(input, findIndex(input, max));
        System.out.print(max + ", ");
        max = 0;

        for (int j = 0; j < input.length; j++){
            if (input[j] > max){
                max = input[j];
            }
        }
        input = removeTheElement(input, findIndex(input, max));
        System.out.print(max + ", ");
        max = 0;

        for (int k = 0; k < input.length; k++){
            if (input[k] > max){
                max = input[k];
            }
        }
        input = removeTheElement(input, findIndex(input, max));
        System.out.print(max);
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
