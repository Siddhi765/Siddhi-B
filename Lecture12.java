import java.util.*;
public class Lecture12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String FirstName = "Siddhi";
        String LastName = "Bedge";
        String FullName = FirstName +" "+ LastName;
        System.out.println(FullName);

        //length() :- To print length of string -> calcute space also
        System.out.println(FullName.length());

        //charAt :- To print the char one by one
        for(int i = 0; i < FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }

        //compareTo :- To compare String
        String Name1 = "Tony";
        String Name2 = "To";
        if(Name1.compareTo(Name2) == 0)
        {
            System.out.println("Strings are equal");
        }
        else if(Name1.length() > Name2.length()){
            System.out.println("Name1 is greater");
        }
        else{
            System.out.println("Strings are not equal");
        }

        String sentence = "My name is Tony";
        String MyName = "Siddhi Bedge";
        //substring(beg index , end index);
        String name = sentence.substring(11 , sentence.length());
        System.out.println(name);
        String MyNameFull = MyName.substring(0 , 6);
        String MyNameFull1 = MyName.substring(0);
        System.out.println(MyNameFull1);
        System.out.println(MyNameFull);

        //String are immutable :- We cannot Modify or change the string or delete the string to modify it we have to create another string
    }
} 


