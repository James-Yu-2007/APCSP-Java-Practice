package Medium;

import java.util.*;

public class M_02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("Input: "); 
        String inputStr=sc.nextLine();

        inputStr = inputStr.replace(" ", ""); 
        inputStr = inputStr.replace("\"", ""); 
        inputStr = inputStr.replace(".", ""); 

        String[] array = inputStr.split(",", -2);
        String X = array[0].substring(array[0].indexOf("=") + 1);
        int Q = Integer.valueOf(array[1].substring(array[1].indexOf("=") + 1));
        String string = "";
        for (int j = 0; j < 10; j++){
            string += X;
        }

        String[] queryArr = {};
        for (int i = 1; i <= Q; i++){
            Scanner sc2=new Scanner(System.in);  
            System.out.print("Query " + i + ": "); 
            String query = sc2.nextLine();
            queryArr = Arrays.copyOf(queryArr, queryArr.length + 1);
            queryArr[queryArr.length - 1] = query;
        }
        System.out.println("Output: ");
        for (int k = 0; k < queryArr.length; k++){
            String[] array2 = queryArr[k].split(" ", -2);
            if (string.charAt(Integer.valueOf(array2[0])) == string.charAt(Integer.valueOf(array2[1]))){
                    System.out.println("Yes");
                } else {System.out.println("No");}
        }
    }
}
