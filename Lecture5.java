// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Lecture5 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter rows and colunm to print solid rectangle");
    //     int row = sc.nextInt(); // Take rows and column from user
    //     int col = sc.nextInt();
    //     // Nested loops :- Loop ke under loop
    //     // Outer loop
    //     for(int r = 1; r <= row; r++){
    //         // Inner loop
    //         for(int c = 1; c <= col; c++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }
// }
//Hollow rectangle
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows and colunm to print Hollow Rectangle");
//         int n = sc.nextInt(); // Take rows and column from user
//         int m = sc.nextInt(); // n -> rows ; m -> col
//         // Nested loops :- Loop ke under loop
//         // Outer loop
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Half pyramid
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows to print Half Pyramid: ");
//         int n = sc.nextInt(); // Take rows and column from user
//         // n -> rows ; m -> col
//         // Nested loops :- Loop ke under loop
//         // Outer loop :- for(i to n)
//         for(int i = 1; i <= n; i++){
//             // Inner loop :- for(j to i)
//             for(int j = 1; j <= i; j++){
//                     System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted half pyramid
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows to print Inverted Half Pyramid: ");
//         int n = sc.nextInt(); // Take rows and column from user
//         // n -> rows ; m -> col
//         // Nested loops :- Loop ke under loop
//         // Outer loop :- for(n to 1)
//         for(int i = n; i >= 1; i--){
//             // Inner loop :- for(j to i)
//             for(int j = 1; j <= i; j++){
//                     System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted Half Pyramid(Rotated by 180 degree)
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows to print Inverted Half Pyramid(Rotated by 180 degree): ");
//         int n = sc.nextInt(); // Take rows and column from user
//         // n -> rows ; m -> col
//         // Nested loops :- Loop ke under loop
//         // Outer loop :- for(i=1 to n)
//         for(int i = 1; i <= n; i++){
//             // 1st Inner loop :- space -> for(j=1 to n-i)
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             // 2nd Inner loop :- star -> for(j=1 to i)
//             for(int j = 1; j<= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }
// }

//Half Pyramid With Number
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows to print Half Pyramid With Number: ");
//         int n = sc.nextInt(); // Take rows and column from user
//         // n -> rows ; m -> col
//         // Nested loops :- Loop ke under loop
//         // Outer loop :- for(i=1 to n)
//         for(int i = 1; i <= n; i++){
//             // Inner loop :- for(j=1 to i)
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println(); 
//         }
//     }
// }

//Inverted Half Pyramid With Number
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows to print Inverted Half Pyramid With Number: ");
//         int n = sc.nextInt(); // Take rows and column from user
//         // n -> rows ; m -> col
//         // Nested loops :- Loop ke under loop
//         // Outer loop :- for(i=1 to n)
//         for(int i = 1; i <= n; i++){
//             // Inner loop :- for(j=1 to n-i+1)
//             for(int j = 1; j <= n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println(); 
//         }
//     }
// }


//Floyd's Triangle
// Lecture 5 : Print 9 differnt patterns
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows to print Floyd's Triangle: ");
//         int n = sc.nextInt(); // Take rows and number from user
//         int num = 1;
//         // n -> rows ; num -> number
//         // Nested loops :- Loop ke under loop
//         // Outer loop :- for(i=1 to n)
//         for(int i = 1; i <= n; i++){
//             // Inner loop :- num -> for(j=1 to i)
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num+" ");
//                 num++; // to increase the value by 1 // num=num+1
//             }
//             System.out.println(); 
//         }
//     }
// }

// 0-1 Triangle
// Lecture 5 : Print 9 differnt patterns
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows to print 0-1 Triangle: ");
        int n = sc.nextInt(); // Take rows 
        // n -> rows 
        // Nested loops :- Loop ke under loop
        // Outer loop :- for(i=1 to n)
        for(int i = 1; i <= n; i++){
            // Inner loop :- num -> for(j=1 to i)
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println(); 
        }
    }
}