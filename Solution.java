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
    if(node==null){
        return null;
    }
     Map<Node,Node> vis = new HashMap<>();
     return cloneNode(vis,node);
    }
    private Node cloneNode(Map<Node,Node>vis,Node node){
      if(vis.containsKey(node)){
        return vis.get(node);
      }
      Node clone = new Node(node.val);
      vis.put(node,clone);
      for(Node nb:node.neighbors){

         clone.neighbors.add(cloneNode(vis,nb)) ;
      }
      return clone;
    }
}
