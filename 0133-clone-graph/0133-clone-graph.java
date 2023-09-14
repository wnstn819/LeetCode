/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
 
    public Node cloneGraph(Node node) {
      if(node == null)
		 return null;
	 
	 Map<Integer, Node> map = new HashMap<>();
	 Queue<Node> que = new LinkedList<>();
	 map.put(node.val, new Node(node.val));
	 que.add(node);
	 
	 while(!que.isEmpty()) {
		 Node cur = que.poll();
		 Node temp = map.get(cur.val);
		 
		 for(Node neighborsNode: cur.neighbors) {
			 if(!map.containsKey(neighborsNode.val)) {
				 map.put(neighborsNode.val, new Node(neighborsNode.val));
				 que.add(neighborsNode);
			 }
			 temp.neighbors.add(map.get(neighborsNode.val));
		 }
	 }
     
     return map.get(node.val);
    }
 
 
}