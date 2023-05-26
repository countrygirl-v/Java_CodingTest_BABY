import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        ArrayList<String> strArrayList = new ArrayList<String>();

        for(int i = 0; i < my_string.length();i++){
            for(int j = 0; j < n; j++){
                strArrayList.add(String.valueOf(my_string.charAt(i)));
            }
        }
        for(String item:strArrayList) answer += item;

        return answer;
    }
}