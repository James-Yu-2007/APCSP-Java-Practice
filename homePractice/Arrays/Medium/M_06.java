package homePractice.Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M_06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("input: "); 
        String inputStr=sc.nextLine();
        sc.close();
        inputStr = inputStr.replace(" ", ""); 
        inputStr = inputStr.replace("{", ""); 
        inputStr = inputStr.replace("}", ""); 
        String[] input = inputStr.split("=", -2);
        input[1] = input[1].substring(0, input[1].length() - 2);
        String[] a = input[1].split(",", -2);
        int K = Integer.valueOf(input[2]);
        int N = a.length;
        System.out.println(kthLargestSum(a, N, K));
    }

    static int kthLargestSum(String arr[], int N, int K){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += Integer.valueOf(arr[j]);
                result.add(sum);
            }
        }
        Collections.sort(result,
                         Collections.reverseOrder());
        return result.get(K - 1);
    }
}
