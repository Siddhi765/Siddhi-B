//import java.util.*;//To take input from user
//import java.util.HashSet;//For HashSet(NO repetation):- used in Q.no.8 
public class Lecture18 {
    //__________________________TOWER OF HONOI________________________________//
    // public static void towerOfHanoi(int n,String source,String helper,String dest){
    //     //1 -> n-1 disk ko source -> help mein transfer
    //     if(n == 1){
    //         System.out.println("Tranfer disks "+ n +"From "+source+"to"+dest);
    //         return;
    //     } 
    //     //H->D and d->H for 2 and 3 disks 
    //     towerOfHanoi(n-1,source,dest,helper);
    //     System.out.println("Tranfer disks "+ n +" From "+source+"to"+dest);
    //     //S->H and H->S for 2 and 3 disks 
    //     towerOfHanoi(n-1,helper,source,dest);
    // }
    // public static void main(String args[]){
    //     int n = 3;//Total no of disks
    //     towerOfHanoi(n,"S","H","D");
    // }
    //_____________________________STRING REVERSE______________________________//
    // public static void printReverse(String str,int index){
    //     if(index == 0){
    //         System.out.println(str.charAt(index));
    //         return;
    //     }
    //     System.out.print(str.charAt(index));
    //     printReverse(str,index-1);
    // }
    // public static void main(String args[]){
    //     String str = "abcd";
    //     printReverse(str,str.length()-1);
    // }
    //______________________________1st AND Last OCCURANCE OF STRING________________________________//
    //Do not initialize first and last as a parameter initialize with static(value remains constant) 
    // public static int first = -1; 
    // public static int last = -1;
    // public static void find_Occurance(String str,int index,char element){
    //     if(index == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //         }
    //     char current_char = str.charAt(index);
        
    //     if(current_char == element){
    //         if(first == -1){
    //             first = index;//update first index
    //         }else{
    //             last = index;//update last index
    //         }
    //     }
    //     find_Occurance(str,index+1,element);//index+1 -> to check next occurance of the character
    // }
    // public static void main(String args[]){
    //     String str = "abaacdae";
    //     find_Occurance(str,0,'a');
    // }
    //________________________________CHECK AN LISTS OF ELEMENTS OR ARRAY IS SORTED OR NOT_____________________________________//
    // public static boolean isSorted(int arr[],int index){
    //     if(index == arr.length-1){
    //         return true;
    //     }
    //     if(arr[index] < arr[index+1]){
    //         //array is sorted till now
    //         return isSorted(arr,index+1);
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // public static void main(String args[]){
    //     int arr[] = {1,2,3,3,4,5};
    //     System.out.println(isSorted(arr,0));
    // }
    //________________________________MOVE ALL 'x' AT THE END_______________________________________//
    // public static void moveAllX(String str,int index,int count,String newString){
    //     if(index == str.length()){
    //         for(int i = 0; i < count; i++){
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char current_char = str.charAt(index);
    //     if(current_char == 'x'){
    //         count++;
    //         moveAllX(str, index+1, count, newString);
    //     }
    //     else{
    //         newString += current_char;//newString = newString + current_char
    //         moveAllX(str, index+1, count, newString);
    //     }
    // }
    // public static void main (String args[]){
    //     String str = "axbcxxd";
    //     moveAllX(str, 0, 0, "");
    // }
    //____________________________________REMOVE DUBLICATES_____________________________________//
    // public static boolean[] map = new boolean[26];//26-> english char
    // public static void removeDubli(String str,int index,String newStr){
    //     if(index == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char current_char = str.charAt(index);
    //     if(map[current_char - 'a'] == true){
    //         removeDubli(str, index+1, newStr);
    //     }
    //     else{
    //         newStr += current_char;
    //         map[current_char - 'a'] = true;
    //         removeDubli(str, index+1, newStr);
    //     }
    // }
    // public static void main(String args[]){
    //     String str = "abbccda";
    //     removeDubli(str, 0, "");
    // }
    //_________________________________ALL SUBSEQUENCES_______________________________________//
    // public static void subsequences(String str,int index,String newStr){
    //     if(index == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char current_char = str.charAt(index);
    //     //Two chioces to character to choose and not to choose 
    //     //to be -> choose
    //     subsequences(str, index+1, newStr+current_char);
    //     //or not to be -> no choose
    //     subsequences(str, index+1, newStr);
    // }
    // public static void main(String[] args) {
    //     String str = "abc";//Change string "aaa" just compare with question no. 9 
    //     subsequences(str, 0, "");
    // }
    //__________________________________UNIQUE SUBSEQUENCES_________________________________________________//
    // public static void subsequences(String str,int index,String newStr,HashSet<String> set){
    //     if(index == str.length()){
    //         if(set.contains(newStr)){
    //             return;
    //         }
    //         else{
    //             System.out.println(newStr);
    //             set.add(newStr);
    //             return;
    //         }
    //     }

    //     char current_char = str.charAt(index);
    //     //Two chioces to character to choose and not to choose 
    //     //to be -> choose
    //     subsequences(str, index+1, newStr+current_char,set);
    //     //or not to be -> no choose
    //     subsequences(str, index+1, newStr,set);
    // }
    // public static void main(String[] args) {
    //     String str = "aaa";
    //     //Hashset -> use:- To avoid repetation of characters
    //     HashSet<String> set = new HashSet<>();
    //     subsequences(str, 0, "",set);
    // }
    //_____________________________________KEYPAD COMBINATION_____________________________________________//
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str,int index,String combination){
        //Combination -> newStr
        //base condition
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char current_char = str.charAt(index);
        String mapping = keypad[current_char-'0'];

        for(int i = 0; i < mapping.length(); i++)
        {
            printComb(str, index+1, combination+mapping.charAt(i));//Adding character 1st 'd' call -> 2nd 'e' call -> 3rd 'f' call.....
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
        System.out.println("-------------------------");
        String str1 = "2";
        printComb(str1, 0, "");
    }
}       
