import java.util.*;
public class NamePrint{
    public static void printName(String name){
        System.out.print("Welcome " + name + "!");
        return;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter name: ");
        String name =sc.nextLine();
        printName(name);
    }
}