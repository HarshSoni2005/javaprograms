import java.util.*;
public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b= sc.nextInt();
        System.out.print("Enter the operation you want to perform (+,-,/ or *): ");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+': 
                System.out.println("ADDITION OF " +a+ " AND " +b+ " IS " +(a+b));
                break;
            case '-': 
                System.out.println("SUBTRACTION OF " +a+ " AND " +b+ " IS " +(a-b));
                break;
            case '/': 
                System.out.println("DIVISION OF " +a+ " AND " +b+ " IS " +(a/b));
                break;
            case '*':
                System.out.println("MULTIPLICATION OF " +a+ " AND " +b+ " IS " +(a*b));
                break;
            default:
                System.out.println("INVALID INPUT!");
                break;
        }
    }
}
