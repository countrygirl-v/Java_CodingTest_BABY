import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.valueOf(1);

        for (int i = balls; i > share; i--) answer = answer.multiply(BigInteger.valueOf(i));
        for (int j = 2; j <= balls - share; j++) answer = answer.divide(BigInteger.valueOf(j));
        
    
        return answer.intValue();
    }
}