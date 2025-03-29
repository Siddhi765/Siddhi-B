import java.util.*;
public class Lecture11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        //Declaration of 2D array
        int numbers[][] = new int[rows][columns];
        System.out.println("Enter elements in the array: ");
        //Input
        //Outer loop -> rows -> i
        for(int i = 0; i < rows; i++){
            //Inner loop -> columns -> j
            for(int j = 0; j < columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements present in the array are: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println(numbers[i][j] + " ");
            }
            // System.out.println();
        }
    }
}
