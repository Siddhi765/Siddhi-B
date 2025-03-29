//Exercise :- Total 10 Ques. 8 -> Moderate and 2 -> BONUS

// Q.1 Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;
// public class Lecture8b {
//     public static int avg(int a, int b, int c){
//         int average = (a + b + c) / 3;
//         return average;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter 3rd number: ");
//         int c = sc.nextInt();
//         int average = avg(a,b,c);
//         System.out.print("Average is: "+ average);
//     }
// }

//Q.2 Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.*;
// public class Lecture8b {
//     public static void printSum(int n){
//         int sum = 0;
//         for(int i = 0; i <= n; i++){
//             if(i%2 != 0){
//                 sum = sum + i;
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = sc.nextInt(); // Sum of all odd number till the value of n enter by user -> Ex. n=5 -> 1+3+5 = 9
//         printSum(n);

//     }
// }

//Q.3 Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.*;
// public class Lecture8b {
//     public static int getGreater(int a, int b){
//         if(a > b){
//             System.out.println("Greatest number is: "+ a);
//             return a;
//         }
//         else{
//             System.out.println("Greatest number is: "+ b);
//             return b;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd number: ");
//         int b = sc.nextInt();
//         // System.out.println("Greatest number is: "+ 
//         getGreater(a,b);
//     }
// }

//Q.4 Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.*;
// public class Lecture8b {
//     public static Double CircumOfCircle(Double radius){
//         return (2 * 3.14 * radius);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Radius: ");
//         Double radius = sc.nextDouble(); //We take radius datatype as double because the value of pie is double i.e. 3.14
//         System.out.print("The circumference of a circle is: "+ CircumOfCircle(radius));

//     }
// }

//Q.5 Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.

// import java.util.*;
// public class Lecture8b{
//     public static void ageOfPerson(int age){
//        if(age > 18){
//         System.out.println("Eligible for vote");
//        }     
//        else{
//         System.out.println("Not eligible for vote");
//        }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age of Person: ");
//         int age = sc.nextInt();
//         ageOfPerson(age);
//     }
// }

//Q.6 Write an infinite loop using do while condition.

// import java.util.*;
// public class Lecture8b{
//     public static void DivideByZero(int a){
//         do{
            
//         }while(a > 0);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int a = sc.nextInt();
//         DivideByZero(a);
//     }
//     //     do{

//     //     }while(true);
//     // }
// }

//Q.7 Write a program to enter the numbers till the user wants and at the end 
//it should display the count of positive, negative and zeros entered.

// import java.util.*;
// public class Lecture8b{
//     public static void main(String args[]){
//         int positive = 0, negative = 0, zeros = 0;
//         System.out.println("Print 1 to continue and 0 to stop");
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         while(input == 1){
//             System.out.print("Enter a number: ");
//             int number = sc.nextInt();
//             if(number > 0){
//                 positive++;
//             }
//             else if(number < 0){
//                 negative++;
//             }
//             else{
//                 zeros++;
//             }
//             System.out.println("Press 1 to continue & 0 to stop");
//             input = sc.nextInt();
//         }
//         System.out.println("Positives : "+ positive);
//         System.out.println("Negatives : "+ negative);
//         System.out.println("Zeros : "+ zeros);
//     }
// }



//--------------------------------NOT WORKING QUESTION NO 8------------------------------------//



//Q.8 Two numbers are entered by the user, x and n. 
//Write a function to find the value of one number raised to the power of another i.e. xn.
//Try to convert it into a function on your own.

// import java.util.*;
// public class Lecture8b {
//    public static void main(String args[]) {
//        System.out.println("Enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();

//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }


//        System.out.println("x to the power n is : "+ result);
//    }   
// }

//_________________________________________OR_________________________________________


//--------------------------------NOT WORKING QUESTION NO 8------------------------------------//


import java.util.*;
public class Lecture8b{
    public static void power(int x, int n){
        int result = n^x;
        System.out.print("x to the power n is: "+ result);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        power(x,n);


    }
}