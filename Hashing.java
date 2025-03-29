//Lecture 34 :- HashSet

// import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Inserting :- O(1)
        set.add(1); //set.add(ele)
        set.add(2);
        set.add(3);
        set.add(1); //Do not add dublicates

        //Print all element
        System.out.println(set);

        //Size 
        System.out.println("Size of set is: "+set.size());

        //Iterator in sets
        Iterator it = set.iterator();

        //hasNext; next 
        //Order can be changed & not constant over time 

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Search - contains :- O(1)
        //set.contains(eleToSearch)
        if(set.contains(1)){
            System.out.println("Set contains");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }

        //Delete :- O(1)
        set.remove(1); //set.remove(eleToRemove)
        if(!set.contains(1)){
            System.out.println("We deleted 1 from set");
        }
    }
}
