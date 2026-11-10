class Solution {
    public int titleToNumber(String columnTitle) {
        long ans = 0;

        //same idea as decimal parsing, but base is 26
        for(int i = 0; i < columnTitle.length(); i++){
            char a = columnTitle.charAt(i);
            int value = a - 'A' + 1;
            ans = ans * 26 + value;
        }
        return (int)ans;
    }
}