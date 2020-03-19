public class Solution {

    public static int solution(int X, int[] A) {

        for (int i = 1; i < A.length; i++) {
            int preSum = 0;
            int postSum = 0;
            for (int j = 0; j < i; j++) {
                if (A[j] == X) {
                    preSum++;
                }
            }
            for (int k = i; k < A.length; k++) {
                if (A[k] != X) {
                    postSum++;
                }
            }
            if (preSum == postSum) {
                return i;
            }
        }
        return A.length;
    }

    public static void main(String[] args) {
        int num = solution(5, new int[]{5, 5, 1, 7, 2, 3, 5});
        System.out.println("index " + num);
    }

}
