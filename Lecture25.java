//_____________________ARRAY LISTS______________________//
import java.util.ArrayList;
import java.util.Collections;

public class Lecture25{
    public static void main(String args[]){
        //Declare arrylist :- ArrayLists<Type> ArrayList_name = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //OR you can declare like this
        //ArrayList<Integer> list = new ArrayList<Integer>();
        
        //___________BASIC FUNCTIONS ON ArrayList___________//

        //1.add element :- use .add() -> ArrayList_name.add();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list); // O/P = [0, 2, 3]

        //2.get element :- use .get(index) -> ArrayList_name.get(index);
        //to get element at indext zero
        int element = list.get(0); //We store the element at index zero in element variable
        System.out.println(element); // O/P = 0

        //3.add element in between :- use .add(index,element to be add) -> ArrayList_name.add(index,element to be add);
        list.add(1,1);
        System.out.println(list); // O/P = [0, 1, 2, 3]

        //4.set element :- use .set(index,element to be change) -> ArrayList_name.set(index,element to be change);
        //To change the element that store previously
        list.set(0,5);
        System.out.println(list); // O/P = [5, 1, 2, 3]

        //5.delete element :- use .remove();
        list.remove(3);
        System.out.println(list); // O/P = [5, 1, 2]

        //6.ArrayList size :- use list.size();
        System.out.println("Size of ArrayList is: "+list.size()); // O/P = 3

        //7.Loop/iterate
        for(int i= 0; i < list.size(); i++){
            System.out.println(list.get(i)); // O/P = 3 5 1 2
        }

        //8.Sorting :- automatically ascending order
        Collections.sort(list);
        System.out.println(list); // O/P = [1, 2, 5]

        //9.add element at specific index -> NOTE :- Sme like add in between

        //10.set element at specific index :- use .set(index,element to be set) -> ArrayList_name.set(index,element to be set);
        list.set(2,6);
        System.out.println(list); // O/P = [1, 2, 6]
    }
}

// OUTPUT (Overall)
// [0, 2, 3]                          OPn 1
// 0                                  OPn 2
// [0, 1, 2, 3]                       OPn 3
// [5, 1, 2, 3]                       OPn 4
// [5, 1, 2]                          OPn 5
// Size of ArrayList is: 3            OPn 6
// 5                                  OPn 7
// 1                                  "---"
// 2                                  "---"
// [1, 2, 5]                          OPn 8
// [1, 2, 6]                          OPn 10
