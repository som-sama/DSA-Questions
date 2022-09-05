public class VericalOrder {
    //question :  https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

    class Solution {
        List<Integer>[][] store;
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            this.store = new ArrayList[1000][2000];

            helper(root, 0, 1000);

            List<List<Integer>> result = new ArrayList<>();

            for(int j = 0; j < 2000; j++){
                List<Integer> list = new ArrayList<>();
                for(int i = 0; i < 1000; i++){
                    List<Integer> r = store[i][j];

                    if(r != null){
                        Collections.sort(r);
                        for(int t : r){
                            list.add(t);
                        }
                    }
                }

                if(list.size() != 0){
                    result.add(list);
                }
            }

            return result;
        }

        private void helper(TreeNode root, int row, int col){
            if(root == null) return;

            if(store[row][col] == null) store[row][col] = new ArrayList<>();
            store[row][col].add(root.val);

            helper(root.left, row+1, col-1);
            helper(root.right, row+1, col+1);
        }
    }
}
