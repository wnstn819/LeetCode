class Node {
    Map<Character , Node > map;
    int count;
    boolean isEnd;
    Node(){
        map = new HashMap<>();
        count = 0;
    }

    void plusCount(){
        count++;
    }


}

class WordDictionary {
    Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!node.map.containsKey(c)) node.map.put(c,new Node());
            node = node.map.get(c);
        }
        node.plusCount(); 
        node.isEnd = true;
    }
    
    public boolean search(String word) {
       return dfsSearch(root, word, 0);  
    }

    public boolean dfsSearch(Node p, String word, int start) {
		if (p.isEnd && start == word.length())
			return true;
 
		if (start >= word.length())
			return false;
 
		char c = word.charAt(start);
 
		if (c == '.') {
			boolean tResult = false;
			for (char key : p.map.keySet()) {
				if (p.map.get(key) != null) {
					if (dfsSearch(p.map.get(key), word, start + 1)) {
						tResult = true;
						break;
					}
				}
			}
 
			if (tResult)
				return true;
		} else {
		
			if (p.map.get(c) != null) {
				return dfsSearch(p.map.get(c), word, start + 1);
			} else {
				return false;
			}
		}
 
		return false;
	}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */