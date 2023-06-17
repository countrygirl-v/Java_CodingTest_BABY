import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                result = participant[i];
                break;
            }
        }
        if(result.equals("")) result = participant[participant.length - 1];
        return result;

    }
}