//Exercise :- Total 10 Ques. 8 -> Moderate and 2 -> BONUS

// Q.1 Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class Lecture8 {
    public static int avg(int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        System.out.print("Enter 2nd number: ");
        System.out.print("Enter 3rd number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = avg(a,b,c);
        System.out.print("Average is: "+ average);
    }
}
