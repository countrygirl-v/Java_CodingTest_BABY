class Solution {
    public String solution(String my_string, String alp) {
        for (String s : my_string.split("")) {
            if (s.equals(alp)) my_string = my_string.replace(s, s.toUpperCase());
        }
        return my_string;
    }
}