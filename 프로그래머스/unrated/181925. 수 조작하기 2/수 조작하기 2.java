class Solution {
    public String solution(int[] numLog) {
        int temp = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < numLog.length; i++) {
                temp = numLog[i] - numLog[i - 1];
                switch (temp) {
                    case 1 -> sb.append("w");
                    case -1 -> sb.append("s");
                    case 10 -> sb.append("d");
                    case -10 -> sb.append("a");
                }
            }
            return sb.toString();
    }
}