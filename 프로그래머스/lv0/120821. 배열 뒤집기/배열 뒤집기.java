class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = num_list.length; i > 0; i--) answer[num_list.length - i] += num_list[i-1];
        return answer;
    }
}