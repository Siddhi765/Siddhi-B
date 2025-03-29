//_____________________________Arrays______________________________//
import java.util.*;
public class Lecture9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int Size = sc.nextInt();
        int Numbers[] = new int[Size]; //Array declaration

        System.out.println("Enter element in the array: ");
        //Input
        for(int i = 0; i < Size; i++){
            Numbers[i] = sc.nextInt();
        }

        //Outout
        System.out.println("The stored array is: ");
        for(int i = 0; i < Size; i++){
            System.out.println(Numbers[i]);
        }
        
        // int marks[] = new int[5];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // marks[3] = 92;
        // marks[4] = 94;

        // // System.out.print(marks[0]);
        // System.out.print(marks[1]);
        // System.out.print(marks[2]);

        // for(int i = 0; i < 5; i++){
        //     System.out.println(marks[i]);
        // }


    }
}
