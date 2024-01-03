class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            switch (direction) {
                case "E" -> {
                    boolean check = false;
                    if (answer[1] + distance >= park[0].length()) break;
                    for (int k = 1; k <= distance; k++) {
                        if (park[answer[0]].charAt(answer[1] + k) == 'X') {
                            check = true;
                            break;
                        }
                    }
                    if (check) break;
                    answer[1] += distance;
                }
                case "W" -> {
                    boolean check = false;
                    if (answer[1] - distance < 0) break;
                    for (int k = 1; k <= distance; k++) {
                        if (park[answer[0]].charAt(answer[1] - k) == 'X') {
                            check = true;
                            break;
                        }
                    }
                    if (check) break;
                    answer[1] -= distance;
                }
                case "S" -> {
                    boolean check = false;
                    if (answer[0] + distance >= park.length) break;
                    for (int k = 1; k <= distance; k++) {
                        if (park[answer[0] + k].charAt(answer[1]) == 'X') {
                            check = true;
                            break;
                        }
                    }
                    if (check) break;
                    answer[0] += distance;
                }
                case "N" -> {
                    boolean check = false;
                    if (answer[0] - distance < 0) break;
                    for (int k = 1; k <= distance; k++) {
                        if (park[answer[0] - k].charAt(answer[1]) == 'X') {
                            check = true;
                            break;
                        }
                    }
                    if (check) break;
                    answer[0] -= distance;
                }
            }
        }
        return answer;
    }
}