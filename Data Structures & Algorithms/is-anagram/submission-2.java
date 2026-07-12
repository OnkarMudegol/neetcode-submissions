class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        if(s.length() != t.length()) return false;

            for(int i=0; i<s.length();i++){
                char charS = s.charAt(i);
                char charT = t.charAt(i);    

                mapS.put(charS, mapS.getOrDefault(charS, 0)+1);
                mapT.put(charT, mapT.getOrDefault(charT, 0)+1);
            }

            for(Character key : mapS.keySet()){
                int countS = mapS.get(key);
                int countT = mapT.getOrDefault(key,0);
                if(countS != countT) return false;
            
        }

        return ans;
    }
}
