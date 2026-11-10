class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder result = new StringBuilder();
        int n = columnNumber;

        while(n > 0){
            n--;
            char c = (char)('A' +  n % 26);
            result.insert(0, c);
            n /= 26;
        }
        return result.toString();
    }
}