class Solution {
    public int solution(String myString, String pat) {
        String upperCaseMyString = myString.toUpperCase();
        String upperCasePat = pat.toUpperCase();
        return upperCaseMyString.contains(upperCasePat) ? 1 : 0;
    }
}