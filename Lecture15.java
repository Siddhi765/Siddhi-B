// Bit Manupulation 
import java.util.*;
public class Lecture15 {
    public static void main(String args[]){
        //Get Bit
        int n = 5; //0101
        int pos = 2; //0100
        int BitMask = 1<<pos;
        // & -> Bitwise AND -> 0100 & 0101 Result = 0100 (Not-zero -> Bit Mask = 1)
        if((BitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

        //Set Bit
        int n1 = 5; //0101
        int pos1 = 1; //0001
        int BitMask1 = 1<<pos1; //0010
        // | -> BitWise OR -> 0010 | 0101 -> Result = 0111 (In decimal 7)
        int newNumber = BitMask1 | n1;
        System.out.println(newNumber);

        //Clear Bit
        int n2 = 5; //0101
        int pos2 = 2; //0001 (3rd Bit)
        int BitMask2 = 1<<pos2;
        //First NOT the result of bitmask then perform Bitwise AND(&) operation
        //~(0100) -> 1011 -> 1011 & 0101 = 0001 ( 1in decimal)
        int NOTofBM = ~(BitMask);
        int ANDofNOTofBM = NOTofBM & n2;
        System.out.println("The result is: " + ANDofNOTofBM);

        //Update Bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation you want to perform (o or 1)");
        int oper = sc.nextInt();
        int n3 = 5;
        int pos3 = 1;
        int BitMask3 = 1<<pos3;
        if(oper == 1){
            //Set Operation -> OR operation
            int newNumber3 = BitMask3 | n3;
            System.out.println("The result is: " + newNumber3);
        }else{
            //Clear operation -> AND operation 
            int NOTofBM3 = ~(BitMask3);
            int ANDofNOTofBM3 = NOTofBM3 & n3;
            System.out.println("The result is: " + ANDofNOTofBM3);
        }

    }
}
