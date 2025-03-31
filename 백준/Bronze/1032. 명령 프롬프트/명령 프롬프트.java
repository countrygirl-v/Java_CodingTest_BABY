import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            inputs.add(input);
        }
        StringBuilder sb = new StringBuilder();
        int len = inputs.get(0).length();

        char[][] chars = new char[n][len];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len; j++) {
                chars[i][j] = inputs.get(i).charAt(j);
            }
        }

        for (int i = 0; i < len; i++) {
            Set<String> set = new LinkedHashSet<>();

            for (int j = 0; j < n; j++) {
                set.add(String.valueOf(chars[j][i]));
            }
            if (set.size() == 1) {
                String fs = set.iterator().next();
                sb.append(fs);
            } else if (set.size() > 1) {
                sb.append("?");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}