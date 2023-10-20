import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length ? Integer.compare(Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum()) : arr1.length > arr2.length ? 1 : -1;
    }
}