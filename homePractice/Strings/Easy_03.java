import java.util.*;

public class Easy_03 {  
    public static void main(String[] args) {  
        int n;  
        String arrNum;
        double returnVal = 0;
        double count = 0;
        String inputArr;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        inputArr=sc.nextLine();  
        String inputStr2 = inputArr.replace(" ", "");
        String inputStr3 = inputStr2.replace("[", "");
        String inputStr4 = inputStr3.replace("]", ""); 
        String inputStr5 = inputStr4.replace("\"", ""); 
        String[] array = inputStr5.split(",", -2);  
        n = array.length; 

        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++) {  
            arrNum = array[i];
            for (int j = (arrNum.length() - 1); j >= 0; j--){
                returnVal += (Double.parseDouble(arrNum.substring(j,(j+1))) * Math.pow(2, count));
                count++;
            }
            count = 0;
        }  
        System.out.println(toBinary((int)returnVal));
    }  
    public static String toBinary(int decimal){    
        int binary[] = new int[40];    
        int index = 0; 
        String returnVal = "";
        while(decimal > 0){    
          binary[index++] = decimal%2;    
          decimal = decimal/2;  
        }    
        for(int i = index-1;i >= 0;i--){    
          returnVal += binary[i];    
        }    
       return returnVal;
     }   
}  
