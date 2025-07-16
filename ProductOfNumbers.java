import java.util.*;
public class ProductOfNumbers {
    public static int calculateProduct(int num1, int num2){
        return num1 * num2;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 =sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 =sc.nextInt();
        System.out.print("Product of " + num1 + " and " + num2 + ": " + calculateProduct(num1, num2));
    }
}
