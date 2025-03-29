//String Builder :- To add , subs , etc.......
import java.util.*;
public class Lecture13 {
    public static void main(String args[]){
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        //Reversing 
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //Continue till half length 
        //Time complextity :- 0 to n/2 -> O(n)
        for(int i = 0; i < sb.length()/2; i++){
            //front -> back
            int front = i;
            //back -> front
            int back = sb.length() - 1 - i; // 5-1-4 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            //Replace front by back and back by front 
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

        // //To print char at index 0 
        // System.out.println(sb.charAt(0));

        // //Set char ata index 0
        // sb.setCharAt(0 , 'P');
        // System.out.println(sb);

        // //Insert char at index 0
        // // sb.insert(0 , 'S');
        // // System.out.println(sb);

        // //Insert char at index 2 to add an extra n
        // sb.insert(2 , 'n');
        // System.out.println(sb);

        // //Delete an extra n
        // sb.delete(2 , 3);
        // System.out.println(sb);

        // //Delete an two n
        // sb.delete(2 , 4);
        // System.out.println(sb);

        // //Append :- Last Mein Jodane keliye 
        // sb.append(" "); // str + " "
        // sb.append("S"); // str + "S"
        // sb.append("tark"); // str + "tark"
        // System.out.println(sb);
        // System.out.println(sb.length()); //To print length

        




    }
}
