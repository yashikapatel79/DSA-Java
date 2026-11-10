class Solution {
    public String convertToTitle(int columnNumber) {
        
        //an empty string created for storing the characters
        StringBuilder result = new StringBuilder();
        int n = columnNumber;

        //run this loop while columnno is positive
        while(n > 0){
            n--;
            //get current character by doing modulo of columnNumber by 26
            char c = (char)('A' +  n % 26);
            result.insert(0, c);
            n /= 26;
        }
        return result.toString();
    }
}