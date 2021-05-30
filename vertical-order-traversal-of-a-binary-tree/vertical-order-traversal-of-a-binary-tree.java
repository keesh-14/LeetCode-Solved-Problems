/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        int hd;
        int count;
        Pair(TreeNode n,int h)
        {
            hd=h;
            node=n;
            
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
     Queue<Pair> q = new LinkedList<Pair>();
        TreeMap<Integer,ArrayList<Integer>> mp = new TreeMap<>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty())
        {
            TreeMap<Integer,ArrayList<Integer>> m = new TreeMap<>();
            int x = q.size();
           
            for(int i=0;i<x;i++)
            {
                 Pair p = q.poll();
                 TreeNode curr = p.node;
                 int hd = p.hd;
               if(m.containsKey(hd))
               {
                   
                   m.get(hd).add(curr.val);
                   ArrayList<Integer> a = m.get(hd);
                   Collections.sort(a);
               }
               else 
               {
                ArrayList<Integer> d = new ArrayList<Integer>();
                d.add(curr.val);
                m.put(hd,d);
               }
               if(curr.left!=null)
                q.add(new Pair(curr.left,hd-1));
               if(curr.right!=null)
                q.add(new Pair(curr.right,hd+1));
            }
            for(Map.Entry<Integer,ArrayList<Integer>>entry:m.entrySet())
            {
                if(mp.containsKey(entry.getKey()))
                {
                    mp.get(entry.getKey()).addAll(m.get(entry.getKey()));
                }
                else
                {
                    mp.put(entry.getKey(),entry.getValue());
                }
            }
            
        }
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
         for(Map.Entry<Integer,ArrayList<Integer>> p : mp.entrySet())
         {
             
             ArrayList<Integer> al = new ArrayList<Integer>();
             al = p.getValue();
             res.add(al);     
         }
        
        return res;
    }
}