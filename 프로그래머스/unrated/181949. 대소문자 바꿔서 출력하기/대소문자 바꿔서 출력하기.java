import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArray = a.toCharArray();
        char[] temp = new char[a.length()];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if(aArray[i] > 64 && aArray[i] < 91) temp[i] = (char) (aArray[i] + 32);
            else if(aArray[i] > 96 && aArray[i] < 123) temp[i] = (char) (aArray[i] - 32);
        }
        for (char c : temp) {
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}