//Recursion Level 1 :- Easy
//import java.util.*;
public class Lecture17 {
        // public static void printNum(int n){
        //     if (n == 6){ //Base condition 
        //         return; // No any value return -> stop when condition is there i.e n = 0
        //     }       
        //     System.out.println(n); // Step 1
        //     printNum(n+1);    // Call -> assume   
        // }
        // public static void main(String args[]){
        //     int n =1;
        //     printNum(n);
        // }

        // public static void printNum(int i, int n, int sum){
        //     if (i == n){ //Base condition 
        //         sum += i;
        //         System.out.println(sum); 
        //         return; // No any value return -> stop when condition is there i.e i = n
        //     }       
        //     sum += i;
        //     printNum(i+1,n,sum); //For traversing -> i++ 
        //     System.out.println(i); //15 ki memory khatam karake neeche aye 
        // }
        // public static void main(String args[]){
        //     printNum(1,5,0);
        //     //Ans :- 1)2+1 = 3 -> 2)3+3 = 6 -> 2)4+6 = 10 -> 5+10 = 15 
        //     //i++ -> sum = sum + i -> ans 
        //     //Let i = 1,n = 5,sum = 0
        //     //i++ = 2 -> 0 = 0+2 = 2 -> 2+1 = 3
        //     //i++ = 3 -> 0 = 0+3 = 3 -> 3+3 = 6
        // }

        // public static int calculate_Factorial(int n){
        //     if(n == 1 || n == 0){
        //         return 1;
        //     }    
        //     int fact_nm1 = calculate_Factorial(n-1); //call
        //     int fact_n = n * fact_nm1;//Kaam
        //     return fact_n ;//Print 
        // }
        // public static void main(String args[]){
        //     int n = 5;
        //     int ans = calculate_Factorial(n);
        //      System.out.println("Result = "+ans);
        //     }

            // public static int calculate_Fibonacci(int a, int b, int n){
            //     if(n == 0){
            //         return 0;
            //     }    
            //     int c = a + b;//Kaam //c -> next term
            //     System.out.println(c);
            //     calculate_Fibonacci(b,c,n-1); //call b = a'(i.e a=b) and c = b'(i.e b=c)

            //     return c ;//Print 
            // }
            // public static void main(String args[]){
            //     int a = 0; //2nd last
            //     int b = 1; //last term
            //     System.out.println(a);
            //     System.out.println(b);
            //     int n = 7;
            //     calculate_Fibonacci(a,b,n-2);
            // }

            public static int calculate_Power(int x, int n){
                if(n == 0){ // base case 1
                    return 1;
                }  
                if(x == 0){ //base case 2
                    return 0;
                }    
                int xPownm1 = calculate_Power(x, n-1);
                int xPown = x * xPownm1;
                return xPown; //Print 
            }
            public static void main(String args[]){
                int x = 2; 
                int n = 5; 
                int ans = calculate_Power(x, n);
                System.out.println(ans);
            }
}
