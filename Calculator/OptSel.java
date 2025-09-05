
import java.util.Scanner;

public class OptSel {
    void selectOption(int opt, Scanner sc) {
        System.out.println("HOW MANY NUMBER :");
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        switch (opt) {
            case 1 -> new Operations().add(nums);
            case 2 -> new Operations().sub(nums);
            case 3 -> new Operations().mul(nums);
            default -> System.out.println("Invalid option");
        }
    }
}
