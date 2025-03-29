// Bubble and selection sort and insertion sort 
//import java.util.*;
public class Lecture16 {
    //Create a function to print the array 
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        //____________________________________BOBBLE SORT________________________________________//
        ////Time complexity :- O(n^2)
        //outer loop -> count -> n-1 Iteration 
        // for(int i = 0; i < arr.length-1; i++){
        //     //Inner loop 
        //     for(int j = 0; j < arr.length-i-1; j++){
        //         //Swap
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        //___________________________________SELECTION SORT__________________________________________//
        //Time complexity :- O(n^2)
        // for(int i = 0; i < arr.length-1; i++){
        //     int smallest = i;
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        //__________________________________INSERTION SORT__________________________________________//
        //Time complexity :- O(n^2)
        for(int i = 1; i < arr.length; i++){ //Unsorted array ko run karte gaye
            int current = arr[i]; //Current element ko uthaya
            int j = i-1; //Sorted part ka last index uthaya
            //Sorted part mein traverse kar rahe hain
            while(j >= 0 && current < arr[j]){
                //To create space 
                //Ek Ek push karate gaye 
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            //Jaise hi jagah bani humne place kiya 
            arr[j+1] = current;
        }
        System.out.print("The sorted array is: ");
        printArray(arr);
    }
}
