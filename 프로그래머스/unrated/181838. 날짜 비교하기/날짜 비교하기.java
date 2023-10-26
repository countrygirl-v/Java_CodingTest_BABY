class Solution {
    public int solution(int[] date1, int[] date2) {
        String dateString1 = "";
        String dateString2 = "";
        for (int date : date1) dateString1 += date;
        for (int date : date2) dateString2 += date;
        
        return Integer.parseInt(dateString1) < Integer.parseInt(dateString2) ? 1 : 0;
    }
}