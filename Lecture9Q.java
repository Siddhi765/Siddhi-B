//Take an array as a input from the user. 
//Search for the given number x and print the index at which it occurs.
import java.util.*;
public class Lecture9Q{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Elements to be inserted in the array are: ");
        //Input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Element to searched is(x): ");
        int x = sc.nextInt();
        //size = numbers.length -> length = array_size
        for(int i = 0; i < size; i++){
            if(numbers[i] == x){
                System.out.println("Element found at index: "+ i);
            }
        }
        
    }
}