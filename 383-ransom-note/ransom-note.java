import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> frq = new HashMap<>();

        // Count frequency of characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            frq.put(ch, frq.getOrDefault(ch, 0) + 1);
        }

        // Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (frq.getOrDefault(ch, 0) == 0) {
                return false;
            }

            frq.put(ch, frq.get(ch) - 1);
        }

        return true;
    }
}


/* class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for(int i = 0; i < magazine.length(); i++){

            int index = magazine.charAt(i) - 'a';

            count[index]++;
        }

        for(int i = 0; i < ransomNote.length(); i++){

            int index = ransomNote.charAt(i) - 'a';

            count[index]--;

            if(count[index] < 0){

                return false;
            }
        }

        return true;
    }
} */