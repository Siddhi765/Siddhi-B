//Lecture 37 :- 5 best question in Hashing

import java.util.*; //java.util.HashMap
public class Classroom {

    //Q.1 :- Majority Element O(n)

    public static void majorityElement(int nums[]){
        //create
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length;

        //Find the frequency of all numbers & stored in map
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){ //true
                map.put(nums[i] , map.get(nums[i]) + 1); //Update the frequency -> freq = freq + 1
            }else{
                map.put(nums[i] , 1); //freq + 1 
            }
        }

        //Map traverse -> Majority element
        for(int key : map.keySet()){
            if(map.get(key) >n/3){
                System.out.println("Majority Element(More freq) is "+key);
            }
        }
    }

    //Q.2 :- Union of 2 arrays O(n)

    public static int unionOf2Arrays(int arr1[] , int arr2[]){
        //Create HashSet -> To store unique element
        HashSet<Integer> set = new HashSet<>();

        //To store ele of arr1 in HashSet
        int n1 = arr1.length;
        for(int i = 0 ; i < n1 ; i++){
            set.add(arr1[i]);
        }

        //To store ele of arr2 in HashSet
        int n2 = arr2.length;
        for(int j = 0 ; j < n2 ; j++){
            set.add(arr2[j]);
        }
        return set.size();
    }

    //Q.3 :- Intersection of 2 arrays O(n)

    public static int intersectionOf2Arrays(int arr1[] , int arr2[]){
        //create
        HashSet<Integer> set = new HashSet<>();

        //To store ele of arr1 in HashSet
        int n1 = arr1.length;
        for(int i = 0 ; i < n1 ; i++){
            set.add(arr1[i]); //unique ele 
        }

        //Match arr2 with HashSet ele(arr1 -> unique)
        int count = 0;
        int n2 = arr2.length;
        for(int j = 0 ; j < n2 ; j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    //Q.4 :- Find the Itinerary from tickets

    public static String getStart(HashMap<String , String> tick){
        HashMap<String , String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            //key -> key ; val -> tick.get(key) -> rev
            revMap.put(tick.get(key) , key);
            //tick.get(key) -> key ; key -> val
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key; //start
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int nums[] = {1 , 3 , 2 , 5 , 1 , 3 , 1 , 5 , 1};
        majorityElement(nums);

        //Union
        int arr1[] = {7 , 3 , 9};
        int arr2[] = {6 , 3 , 9 , 2 , 9 , 4};
        System.out.println("Union of 2 arrays(count of ele) is "+unionOf2Arrays(arr1 , arr2));

        //Intersection
        System.out.println("Intersection of 2 arrays(count of ele) is "+intersectionOf2Arrays(arr1 , arr2));

        //Itinerary
        HashMap<String , String> tick = new HashMap<>();
        tick.put("Chennai", "Bengaluru");
        tick.put("Mumbai", "Delhi");
        tick.put("Goa", "Chennai");
        tick.put("Delhi", "Goa");

        String start = getStart(tick);

        while(tick.containsKey(start)){
            System.out.print(start+" -> ");
            start = tick.get(start); //Update start
        }
        System.out.print(start); //Ending point -> Bengaluru
    }
    //_________________________Q.5 is in Q5OfClassroom.java________________________//
    //OUTPUT OF Q.5 -> Enter the value of k: -10
    //                 Subarray Sum Equal to K is 3
}
