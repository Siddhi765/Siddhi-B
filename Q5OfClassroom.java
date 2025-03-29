//Q.5 Subarray sum equal to k 
//Q.5 if From classroom.java 
//HshiMap 5 best questions

import java.util.*;
public class Q5OfClassroom {
    public static void main(String args[]) {
        int arr[] = { 10, 2, -2, -20, 10 }; // ans = 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        
        // int k = -10;

        HashMap<Integer, Integer> map1 = new HashMap<>(); // <sum,freq>

        map1.put(0, 1);// empty array
        int ans = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map1.containsKey(sum - k)) {
                ans += map1.get(sum - k);
            }

            if (map1.containsKey(sum)) {
                map1.put(sum, map1.get(sum) + 1);
            } else {
                map1.put(sum, 1);
            }
        }
        System.out.println("Subarray Sum Equal to K is " + ans);
    }
}
