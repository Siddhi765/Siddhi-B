//Lecture 35 :- HashMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashing2 {
    public static void main(String args[]){
        //Country -> key & population -> value
        HashMap<String , Integer> map = new HashMap<>();

        //Insert kay-value pair
        map.put("India" , 120);
        map.put("US" , 30);
        map.put("Chaina" , 150);
        map.put("UK" , 40);
        map.put("Japan" , 20);

        System.out.println(map); // Map can be unordered

        map.put("Chiana" , 180); //Key will be update if already present & if not present new pair is inserted

        //Search / look-up
        if(map.containsKey("Chaina")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        //get(key); to print the value associated with the key
        System.out.println(map.get("Chiana")); //Key exists
        System.out.println(map.get("Indonesia")); //Key does not exists -> print null

        //For loop in HashMap
        //for(val_name : collection_name)
        //In normal array
        int arr[] = {12 , 24 , 18};
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println(); 

        //In HashMap
        for(int val : arr){
            System.out.print(val+" "); 
        }
        System.out.println(); 

        //Iteration 
        //By using entrySet
        // for(Map.Entry<Integer_keyDataType , Integer_valueDataType> e : Map.entrySet())
        System.out.println("By using entrySet: ");
        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");  
        }
        System.out.println();

        //By using keySet
        System.out.println("By using keySet: ");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.print(key+ " " + map.get(key)+" "); //To print corresponding value
        }

        //Remove
        map.remove("Chaina");
    }
}
