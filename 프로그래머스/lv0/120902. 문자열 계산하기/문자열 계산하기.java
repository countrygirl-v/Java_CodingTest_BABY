class Solution {
    public int solution(String my_string) {
        String[] my_split = my_string.split(" ");
        int answer = Integer.parseInt(my_split[0]);
        for (int i = 1; i <= my_split.length / 2; i++) {
            switch (my_split[2 * i - 1]) {
                case "+" -> answer += Integer.parseInt(my_split[2 * i]);
                case "-" -> answer -= Integer.parseInt(my_split[2 * i]);
            }
        }
        return answer;
    }
}