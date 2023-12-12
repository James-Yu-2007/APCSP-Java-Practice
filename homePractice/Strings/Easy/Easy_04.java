import java.util.*;

public class Easy_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("number: ");  
        String number=sc.nextLine();
        Scanner sc2=new Scanner(System.in);  
        System.out.print("number: ");  
        int divisor=sc2.nextInt();
        sc.close();
        sc2.close();

        String answer = largeNumDivider(number, divisor);
        System.out.println(answer);
    }
    public static String largeNumDivider(String number, int divisor){
        String result = "";
        int remainder = 0;
        int numeratorCount = 0;
        String tempNumerator = "";
        boolean done = false;

        while(!done){
            for (int i = 0; i < number.length(); i++){
                if (numeratorCount < number.length() && numeratorCount < 9){
                    numeratorCount++;
                    tempNumerator += number.substring(i, i+1);
                } if (numeratorCount == number.length()){
                    result += ("" + Integer.valueOf(tempNumerator) / divisor);
                    number = "" + remainder + number.substring(tempNumerator.length());
                    break;
                } if (numeratorCount == 9) {
                    result += ("" + Integer.valueOf(tempNumerator) / divisor);
                    remainder = Integer.valueOf(tempNumerator) % divisor;
                    number = "" + remainder + number.substring(tempNumerator.length());
                    break;
                }
            }

            if(number.length() <= 10 && Integer.valueOf(number) < divisor){
                done = true;
            } else{
                result = result + largeNumDivider(number, divisor);
                done = true;
            }
        }

        return result;
    }
}