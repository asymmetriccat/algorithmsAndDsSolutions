package algorithms;

import java.util.Collection;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

/*

    Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
  */
public class RansomeNote {
     public boolean canConstruct(String ransomNote, String magazine) {
           Map<Character, Integer> map=new HashMap<>();
         for(int i=0; i<magazine.length(); i++){
             if(map.containsKey(magazine.charAt(i))) map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
             else map.put(magazine.charAt(i),1);
         }
        for(int j=0; j<ransomNote.length(); j++){

             if(map.containsKey(ransomNote.charAt(j))) map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
             else return false;


        }
        for( Integer a: map.values()){
            return a>=0;
         }
         return false;
     }
    public static void main(String args[]){
         RansomeNote ransomeNote =new RansomeNote();
         boolean b=ransomeNote.canConstruct("aa", "ab");
         System.out.println(b);
    }
}
