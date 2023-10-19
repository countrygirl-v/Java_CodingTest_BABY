class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (String s : myString.split("")) {
            if (s.equals("A")) sb.append("B");
            else sb.append("A");
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}