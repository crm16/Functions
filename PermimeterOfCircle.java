import java.util.*;
public class PermimeterOfCircle {
    public static double printPerimeter(double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextFloat();
        System.out.print("Perimeter of circle with radius " + radius + ": " + printPerimeter(radius));
    }
}
