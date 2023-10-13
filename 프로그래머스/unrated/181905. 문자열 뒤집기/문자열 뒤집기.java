class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        return my_string.substring(0, s) + sb.append(my_string.substring(s, e + 1)).reverse() + my_string.substring(e + 1);
    }
}