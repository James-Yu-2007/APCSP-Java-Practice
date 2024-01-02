package homePractice.Arrays.Medium;

import java.util.*;

public class M_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("input 1: "); 
        String inputStr=sc.nextLine(); 
        Scanner sc2=new Scanner(System.in);  
        System.out.print("input 2: "); 
        String inputStr2=sc.nextLine(); 
        String[] input1 = inputStr.split("=", -2);
        String[] input2 = inputStr2.split("=", -2);
        String num1 = input1[1].replace(" ", ""); 
        String num2 = input2[1].replace(" ", ""); 
        num1 = num1.replace("[", ""); 
        num2 = num2.replace("[", ""); 
        num1 = num1.replace("]", ""); 
        num2 = num2.replace("]", ""); 
        num1 = num1.replace(";", ""); 
        num2 = num2.replace(";", ""); 
        String[] strArr1 = num1.split(",", -2);
        String[] strArr2 = num2.split(",", -2);
        sc.close();
        sc2.close();

        int[] numArr1 = toIntArray(strArr1);
        int[] numArr2 = toIntArray(strArr2);
        Arrays.sort(numArr1);
        Arrays.sort(numArr2);
        System.out.println(input1[0] + "= " + Arrays.toString(numArr1));
        System.out.println(input2[0] + "= " + Arrays.toString(numArr2));
    }

    public static int[] toIntArray(String[] array){
        int[] numbers = new int[array.length];
        for(int i = 0;i < array.length;i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        return numbers;
    }
}
