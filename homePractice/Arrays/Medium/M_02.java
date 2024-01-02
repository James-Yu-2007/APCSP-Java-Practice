package homePractice.Arrays.Medium;

import java.util.*;

public class M_02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("input: "); 
        String inputStr=sc.nextLine();
        sc.close();
        inputStr = inputStr.replace(" ", ""); 
        inputStr = inputStr.replace("[", ""); 
        inputStr = inputStr.replace("]", ""); 
        String[] strArray = inputStr.split(",", -2);

        int[] numbers = new int[strArray.length];
        for(int i = 0;i < strArray.length;i++){
            numbers[i] = Integer.parseInt(strArray[i]);
        }

        rearrange(numbers, numbers.length);
        System.out.print(Arrays.toString(numbers));
    }

    public static void rearrange(int arr[], int n){
        int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int pos = i+1, neg = 0;
        while (pos < n && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }
}
