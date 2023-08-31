class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character,Integer> num = new HashMap<>();

     
    for(int i =0;i<s.length();i++){
        int num1 = map.getOrDefault(s.charAt(i),-1);
        int num2 = num.getOrDefault(t.charAt(i),-1);
        if(num1 != num2){
            return false;
        }
        map.put(s.charAt(i),i);
        num.put(t.charAt(i),i);
    }
        return true;

    }
}