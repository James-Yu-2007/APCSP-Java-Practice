import java.util.*;

public class FractionCalc{
    public static void main(String[] args){
        String input = getInput();
        String step2 = processExpression(input);
        System.out.println(step2);
    }
    public static String getInput() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input: ");

        String input = obj.nextLine();
        obj.close();
        return input;
    }
    public static String processExpression(String input) {
       String returnVal = getInput();
       char op;
       String whole = "";
       String numerator;
       String denominator;
       int fractionIndex = 0;
       int _index = 0;
       String[] array = input.split(" ", -2);
       op = array[1].charAt(0);
       if (array[2].contains("/")) {
         fractionIndex = array[2].indexOf("/");
         numerator = array[2].substring(0, fractionIndex);
           denominator = array[2].substring(fractionIndex + 1);
         if (array[2].contains("_")) {
           _index = array[2].indexOf("_");
           whole = array[2].substring(0, _index);
           numerator = array[2].substring(_index + 1, fractionIndex);
         }
       } else {
         whole = array[2];
         numerator = "0";
         denominator = "1";
       }

       input = ( "Op:" + op + " Whole:" + whole + " Num:" + numerator + " Den:" + denominator);
       return input;
     }
}