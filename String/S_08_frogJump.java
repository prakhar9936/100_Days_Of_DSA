package String;

public class S_08_frogJump {

    static int best(int[] height, int n, int idx) {

        // base case
        if (idx == n - 1) {
            return 0;
        } 
        // step 1 jump
        int option1 = best(height, n, idx + 1)
                + Math.abs(height[idx + 1] - height[idx]);
        // step 2 jump
        int option2 = Integer.MAX_VALUE;
        if (idx + 2 < n) {
            option2 = best(height, n, idx + 2)
                    + Math.abs(height[idx + 2] - height[idx]);
        }
        return Math.min(option1, option2);
    }
    public static void main(String[] args) {

        int[] height = {10, 20, 30, 40};

        System.out.println(best(height, height.length, 0));
    }
}