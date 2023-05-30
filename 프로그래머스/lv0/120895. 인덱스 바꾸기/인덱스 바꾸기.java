class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String tempCh;

        String stringArray[] = my_string.split("");
        tempCh = stringArray[num1];
        stringArray[num1] = stringArray[num2];
        stringArray[num2] = tempCh;
        for(String str : stringArray) answer += str;
        
        return answer;
    }
}