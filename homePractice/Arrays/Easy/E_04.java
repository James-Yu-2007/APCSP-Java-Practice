package homePractice.Arrays.Easy;

import java.util.*;

public class E_04 {
    public static void main(String[] args){
        int[] input = {1, 2, 2, 1};
        Arrays.sort(input);
        int newArray[] = new int[input.length];

        for (int i = 0; i < input.length; i++){
            if (i % 2 == 0){
                newArray[i] = input[i/2];
            } else{
                newArray[i] = input[(input.length - 1) - i/2];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
