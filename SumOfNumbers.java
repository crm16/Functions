import java.util.*;
public class SumOfNumbers {
    public static int calculateSum(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Sum of "+ num1 + " and " + num2 +": " +calculateSum(num1, num2));
    }
}
