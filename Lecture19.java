//Recursion class 3 Advance 5 problems 
import java.util.*;
public class Lecture19 {
    //______________________________POSSIBLE PERMUTATIONS__________________________//
    // //Recursive function
    // public static void printPermu(String str,String permutations){
    //     if(str.length() == 0){
    //         System.out.println(permutations);
    //         return;
    //     }
    //     //for loop for traversal
    //     for(int i = 0; i < str.length(); i++){
    //         //current_char = 'b' -> "ab","bc"
    //         char current_char = str.charAt(i);
    //         String newStr = str.substring(0,i)+str.substring(i+1);
    //         printPermu(newStr, permutations+current_char);
    //     }
    // }
    // public static void main(String args[]){
    //     String str = "abc";
    //     printPermu(str,"");
    // }
    //______________________________CALCULATE TOTAL NO. OF PATHS__________________________//
    //Recursive function
    // public static int countPaths(int i, int j, int n, int m){
    //     if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }
    //     //move downward
    //     int downPaths = countPaths(i,j+1,n,m);
    //     //move right
    //     int rightPaths = countPaths(i+1,j,n,m);
    //     return downPaths + rightPaths;
    // }
    // public static void main(String args[]){
    //     int n = 3;
    //     int m = 3;
        
    //     int totalPaths = countPaths(0,0,n,m);
    //     System.out.println("Total no. of paths:- "+totalPaths);

    // }
    //________________________________PLACE TILES_______________________________//
    // public static int placeTiles(int n,int m){
    //     //base cases -> 2
    //     if(n == m){ //base case 1
    //         return 2; // 2 choices ver & hori
    //     }
    //     if(n < m){
    //         return 1; // 1 choice only hori
    //     }
    //     //vertically
    //     int placeVerticle = placeTiles(n-m,m);
    //     //horizontally
    //     int placeHorizontal = placeTiles(n-1,m);
    //     //Total no. of placement
    //     return placeVerticle + placeHorizontal;
    // }
    // public static void main(String args[]){
    //     int n = 4;
    //     int m = 2;
    //     int TotalPlacements = placeTiles(n,m);
    //     System.out.println("Total no. of placements:- "+TotalPlacements);
    // }
    //_________________________________NO. OF WAYS CALL GUESTS_______________________________//
    // public static int callGuest(int n){
    //     //base condition n <= 1 -> single -> way1 -> return 1
    //     if(n <= 1){
    //         return 1;
    //     }
    //     //single 
    //     int way1 = callGuest(n-1);
    //     //pair
    //     int way2 = (n-1) * callGuest(n-2);
    //     //Total no. of ways
    //     return way1 + way2;
    // }
    // public static void main(String args[]){
    //     int n = 4;
    //     System.out.println("Total No. of ways are:- "+callGuest(n));
    // }
    //_________________________________FIND SUBSETS OF SET______________________________//
    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.println(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer> subset){
        //base case
        if(n == 0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubset(n-1,subset);
        //add nahi hoga 
        //pahele jo add hoga usako remove karenge
        //add(n) element stored at last index
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }
    public static void main(String ars[]){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();//Import package -> util
        findSubset(n,subset);
    }
}
