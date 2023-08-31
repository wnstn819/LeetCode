class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1 );
        }

        for(char c : t.toCharArray()){
            if(map.get(c) == null || map.get(c) == 0){
                return false;
            }else{
                map.put(c,map.get(c)-1);
            }
        }

        for(char c : map.keySet()){
            if(map.get(c) >0){
                return false;
            }
        }
        return true;
    }
}