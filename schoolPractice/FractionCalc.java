package schoolPractice;

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
        char op;
        String[] array = input.split(" ", -2);
        String[] input1 = fractionAnalyser(array[0]);
        String[] input2 = fractionAnalyser(array[2]);
        op = array[1].charAt(0);
        if (op == '+') {
          input = additionCalculator(Integer.valueOf(input1[0]), Integer.valueOf(input1[1]), Integer.valueOf(input1[2]), Integer.valueOf(input2[0]), Integer.valueOf(input2[1]), Integer.valueOf(input2[2]));
        } else if (op == '-') {
          input = subtractionCalculator(Integer.valueOf(input1[0]), Integer.valueOf(input1[1]), Integer.valueOf(input1[2]), Integer.valueOf(input2[0]), Integer.valueOf(input2[1]), Integer.valueOf(input2[2]));
        } else if (op == '*') {
          input = multiplicationCalculator(Integer.valueOf(input1[0]), Integer.valueOf(input1[1]), Integer.valueOf(input1[2]), Integer.valueOf(input2[0]), Integer.valueOf(input2[1]), Integer.valueOf(input2[2])); 
        } else {
          input = divisionCalculator(Integer.valueOf(input1[0]), Integer.valueOf(input1[1]), Integer.valueOf(input1[2]), Integer.valueOf(input2[0]), Integer.valueOf(input2[1]), Integer.valueOf(input2[2]));
        }
        input = signFinder(input);
        return input;
      }
    
      public static String[] fractionAnalyser(String input){
        String whole = "";
        String numerator;
        String denominator;
        int fractionIndex = 0;
        int _index = 0;
        input = signFinder(input);
        if (input.contains("/")) {
          fractionIndex = input.indexOf("/");
          numerator = input.substring(0, fractionIndex);
          denominator = input.substring(fractionIndex + 1);
          if (input.contains("_")) {
            _index = input.indexOf("_");
            whole = input.substring(0, _index);
            numerator = input.substring(_index + 1, fractionIndex);
          } else {
            whole = "0";
          }
        } else {
          whole = input;
          numerator = "0";
          denominator = "1";
        }
        String[] array = {whole, numerator, denominator};
        return array;
      }
    
      public static String additionCalculator(int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2){
        int returnWhole = 0;
        int returnNum = 0;
        int returnDen = 0;
        if (whole < 0 && numerator > 0){
            numerator *= -1;
        } if (whole2 < 0 && numerator2 > 0) {
            numerator2 *= -1;
        }
        returnWhole = whole + whole2;
        returnNum = numerator * denominator2 + numerator2 * denominator + returnWhole * denominator * denominator2;
        returnDen = denominator * denominator2;
        String returnVal = fractionSimplifier(returnWhole = 0, returnNum, returnDen);
        return returnVal;
      }
    
      public static String subtractionCalculator(int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2){
        int returnWhole = 0;
        int returnNum = 0;
        int returnDen = 0;
        if (whole < 0 && numerator > 0){
            numerator *= -1;
        } if (whole2 < 0 && numerator2 > 0) {
            numerator2 *= -1;
        }
        returnWhole = whole - whole2;
        returnNum = numerator * denominator2 - numerator2 * denominator + returnWhole * denominator * denominator2;
        returnDen = denominator * denominator2;
        String returnVal = fractionSimplifier(returnWhole = 0, returnNum, returnDen);
        return returnVal;
      }
    
      public static String multiplicationCalculator(int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2){
        int returnWhole = 0;
        int returnNum = 0;
        int returnDen = 0;
        if (whole < 0 && numerator > 0){
            numerator *= -1;
        } if (whole2 < 0 && numerator2 > 0) {
            numerator2 *= -1;
        }
        numerator += whole * denominator;
        numerator2 += whole2 * denominator2;
        returnNum = numerator * numerator2;
        returnDen = denominator * denominator2;
        String returnVal = fractionSimplifier(returnWhole = 0, returnNum, returnDen);
        return returnVal;
      }
    
      public static String divisionCalculator(int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2){
        int returnWhole = 0;
        int returnNum = 0;
        int returnDen = 0;
        if (whole < 0 && numerator > 0){
            numerator *= -1;
        } if (whole2 < 0 && numerator2 > 0) {
            numerator2 *= -1;
        }
        numerator += whole * denominator;
        numerator2 += whole2 * denominator2;
        returnNum = numerator * denominator2;
        returnDen = denominator * numerator2;
        String returnVal = fractionSimplifier(returnWhole = 0, returnNum, returnDen);
        return returnVal;
      }
    
      public static String fractionSimplifier(int whole, int numerator, int denominator){
        boolean simplified = false;
        String returnStr = "";
        boolean done;
        while (!simplified){
            for (int i = 2; i <= Math.abs(numerator); i++){
                done = false;
                while (!done){
                    if (numerator % i == 0 && denominator % i == 0){
                        numerator /= i;
                        denominator /= i;
                    } else {done = true;}
            }}
            if (Math.abs(numerator) >= Math.abs(denominator)){
              if (numerator > 0){
                numerator -= denominator;
                whole++;
              } else {
                numerator += denominator;
                whole--;}
            } else {simplified = true;}
        }
        if (numerator < 0 && Math.abs(whole) > 0){
          numerator *= -1;
        }
        if (whole == 0 && numerator == 0){
          returnStr = "0";
        } else if (whole == 0){
          returnStr = "" + numerator + "/" + denominator;
        } else if (numerator != 0){
          returnStr = "" + whole + " " + numerator + "/" + denominator;
        } else {returnStr = "" + whole;}
        return returnStr;
      }
    
      public static String signFinder(String input) {
        int count = 0;
        String whole = "";
        for (int i = 0; i < input.length(); i++) {
          if (input.charAt(i) == '_') {
            whole = input.substring(0, i + 1);
            input = input.substring(i + 1);
            break;
          }
        }
        for (int i = 0; i < input.length(); i++) {
          if (input.charAt(i) == '-') {
            count++;
          }
        }
        input = input.replace("-", "");
        if (count % 2 == 1) {
          input = "-" + input;
        }
        input = whole + input;
        return input;
      }
}