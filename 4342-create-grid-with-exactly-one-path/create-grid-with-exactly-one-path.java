class Solution {
    public String[] createGrid(int m, int n) {
        String[]ans=new String[m];
        StringBuilder mask=new StringBuilder();
        StringBuilder cur=new StringBuilder();
        for(int i=0;i<n-1;i++){
            cur.append(".");
            mask.append("#");
        }
        cur.append(".");
        mask.append(".");
        ans[0]=cur.toString();
        for(int i=1;i<m;i++){
            ans[i]=mask.toString();
        }
        return ans;
    }
}