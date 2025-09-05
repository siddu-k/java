public class Operations {
    Display D = new Display();

    void add(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans += num;
        }
        D.display(ans, nums);
    }

    void sub(int[] nums) {
        if (nums.length == 0) {
            D.display(0, nums);
            return;
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans -= nums[i];
        }
        D.display(ans, nums);
    }

    void mul(int[] nums) {
        if (nums.length == 0) {
            D.display(0, nums);
            return;
        }
        int ans = 1;
        for (int num : nums) {
            ans *= num;
        }
        D.display(ans, nums);
    }
}

