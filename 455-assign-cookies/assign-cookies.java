class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0 , j = 0, count =0;

        while(i < g.length && j < s.length){

            //Check if cookies satisfied the child
            if(s[j] >= g[i]){
                count++;
                j++;
                i++;
            }
            else {
                //try the next bigger cookie
                j++;
            }
        }
        return count;
    }
}