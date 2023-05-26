import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> divisor = new ArrayList<Integer>();

        for(int i = 1; i < n + 1; i++){
            if(n % i == 0) divisor.add(i);
        }
        for(int j = 0; j < divisor.size(); j++){
            for(int k = 0; k < divisor.size(); k++){
                if(n == divisor.get(j) * divisor.get(k)) answer++;
                else if(n == divisor.get(k) * divisor.get(j)) answer++;
            }
        }
        return answer;
    }
}