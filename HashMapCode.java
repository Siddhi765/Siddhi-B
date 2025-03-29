//Lecture 36: Implementation of HashMap

import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{ //generic(any type) or parametric
        private class Node{
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //No. of nodes
        private int N; //No. of Buckets
        //private int arry[] 
        private LinkedList<Node> buckets[]; //N = buckets.length
        
        //Some times show warning o/p is there
        @SuppressWarnigs("Unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>(); 
                //Har ek index pe jake Khali index create karli to store data/Nodes
            }
        }

        //put()
        private int hashFunction(K key){
            int bi = key.hashCode(); //Return any integer value //biis inbetween 0 to N-1
            return Math.abs(bi) % N; //abs -> absolute -> negative ko positive banata hain
        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i; // i-> data index -> di
                }
            }
            return -1; //Key does npot exists
        }

        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];

            //For empty ll
            for(int i = 0; i < N*2 ; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldBuckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key , V value){
            int bi = hashFunction(key); //Bucket index 
            int di = searchInLL(key , bi); //Data index di = valid(0+) -> di = -1 invalid

            if(di == -1){
                //Key does not exists
                buckets[bi].add(new Node(key , value));
                n++; //New key is added
            }else{
                //Key exists
                Node node = buckets[bi].get(di);
                node.value = value;

            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                //Rehashing
                rehash();
            }
        }

        //remove()
        public V remove(K key){
            int bi = hashFunction(key); //Bucket index 
            int di = searchInLL(key , bi); //Data index di = valid(0+) -> di = -1 invalid

            if(di == -1){
                //Key does not exists
                return null;
            }else{
                //Key exists
                Node node = buckets[bi].remove(di);
                n--; //isEmpty function 
                return node.value;
            }
        }

        //containsKey()
        public boolean containsKey(K key){
            int bi = hashFunction(key); //Bucket index 
            int di = searchInLL(key , bi); //Data index di = valid(0+) -> di = -1 invalid

            if(di == -1){
                //Key does not exists
                return false;
            }else{
                //Key exists
                return true;
            }
        }

        //get()
        public V get(K key){
            int bi = hashFunction(key); //Bucket index 
            int di = searchInLL(key , bi); //Data index di = valid(0+) -> di = -1 invalid

            if(di == -1){
                //Key does not exists
                return null;
            }else{
                //Key exists
                Node node = buckets[bi].get(di);
                return node.value;

            }
        }

        //keySet() :- Return all keys 
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0 ; i < buckets.length ; i++){ //bi
                LinkedList<Node> ll = buckets[i];
                for(int j = 0 ; j < ll.size() ; j++){ //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        //isEmpty()
        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String args[]){
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 190);
        map.put("China" , 200);
        map.put("Nepal" , 80);
        map.put("US" , 150);
        map.put("Japan" , 130);

        ArrayList<String> keys = map.keySet();
        for(int i = 0 ; i < keys.size() ; i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i))); //keys -> to get keys & map -> to print values
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
