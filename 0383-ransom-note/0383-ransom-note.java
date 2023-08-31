class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
       
        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(char c : ransomNote.toCharArray()){
             if(map.get(c) == null || map.get(c) == 0){
                 return false;
             }else{
                 map.put(c, map.get(c)-1);
             }
        }

        return true;
    }
}