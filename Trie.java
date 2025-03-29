//Lecture 38 :- Trie
public class Trie {
    static class Node{
        Node[] children;
        boolean eow; //End Of Word

        public Node(){
            children = new Node[26]; //a to z
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node(); //root node is always empty It stores only children information

    //Insert :- O(L)
    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';

            //children not exists -> create new Node -> insert the node
            if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                //eow -> last letter -> true
                curr.children[idx].eow = true;
            }
            
            //children exists -> go to the next level
            curr = curr.children[idx]; //root for next children is root.children[idx]
        }
    }

    //Search :- O(L)
    public static boolean search(String key){
        Node curr = root; //becz root is static so to value of root is fix to get the value of root we use curr 
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            //does not exists -> return false
            if(node == null){
                return false;
            }
            //Key ke last letter && end of the word -> return false
            if(i == key.length()-1 && node.eow == false){
                return false;
            }

            //update the curr
            curr = curr.children[idx];
        }
        return true;
    }

    //Q.1 :- Word break problem

    public static boolean wordBreak(String key){
        //Base case
        if(key.length() == 0){
            return true; //Empty string is allowed in the tree
        }

        for(int i = 1; i <= key.length(); i++){
            //Divide the string into small parts(subparts of string -> substring) -> 1st & 2nd part
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);

            //Searching first part && recursively searching secon part
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    //Q.2 :- startWith problem

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';

            //Node ke children mein woh wala charchter exists karata hain ya nahi
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx]; //update curr -> level update
        }
        return true;
    }

    //Q.3 :- Count unique substrings

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]); //count of substring of that chlidren
            }
        }
        return count + 1; //add count of empty string
    }

    //Q.4 :- Longest word with all prefix

    public static String ans = ""; //empty string

    public static void longestWord(Node root , StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i = 0; i < 26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                //add/update to temp string -> append -> typecast (char)(i+'a') = 'b'
                temp.append((char)(i + 'a'));
                //temp ans length > final ans length -> update -> final ans = temp ans
                if(temp.length() > ans.length()){
                    ans = temp.toString(); //toString() -> String conversion (ans -> temp)
                }
                //recursive call(back track) to the children -> remove(delete) char from temp ans -> temp.length()-1 -> last char hain
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args){
        // String words[] = {"the" , "a" , "there" , "their" , "any"};
        // for(int i = 0; i < words.length; i++){
        //     insert(words[i]);
        // }
        
        // System.out.println(search("their")); //true
        // System.out.println(search("thor")); //false
        // System.out.println(search("an")); //false

        // String words[] = {"i" , "like" , "sam" , "samsung" , "mobile"};
        // String key = "ilikesamsung";

        //__________________________Q.1_____________________//

        // for(int i = 0; i < words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(wordBreak(key));

        //__________________________Q.2_____________________//

        // String words[] = {"apple" , "app" , "mango" , "man" , "woman"};
        // for(int i = 0; i < words.length; i++){
        //     insert(words[i]);
        // }
        // // String prefix = "app";
        // System.out.println(startWith("app")); //true
        // System.out.println(startWith("moon")); //false

        //__________________________Q.3_____________________//

        // String str = "apple";

        // //to get suffix 
        // for(int i = 0; i < str.length(); i++){
        //     String suffix = str.substring(i);
        //     insert(suffix);
        //     //System.out.print(suffix+" "); //ababa baba aba ba a 
        // }
        // System.out.print(countNode(root)); //10

        //__________________________Q.4_____________________//
        
        String words[] = {"a" , "bannana" , "appl" , "ap" , "apply" , "apple"}; 
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans); //apple
    }
}
