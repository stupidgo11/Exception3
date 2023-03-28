
package exception3;

import java.util.Scanner;


public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try{
        System.out.println(number1+"/"+number2+" is "+(number1/number2));
        }
        catch(ArithmeticException ex){
            System.out.println("Divisor cannot ber zero");
        }
          System.out.println(quotient(1,0));
    }
    
    public static int quotient(int number1,int number2){
        if (number2==0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1/number2;
    }
}
