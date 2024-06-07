import java.util.*;
public class marksarray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int marks[] = new int[100];
        int i;
        int sum=0;
        for(i=0; i<100; i++)
        {
            System.out.print("Enter marks of student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        for(i=0; i<50; i++)
        {
            System.out.println("Student " + (i+1) + " marks: " + marks[i]);
        }
        System.out.println("Sum of marks = " +sum);
    }
    
}
