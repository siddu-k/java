
import java.util.Scanner;

public class OptSel {
    
    void OptSel(int opt){
        System.out.println("HOW MANY NUMBER :");
        int N = new Scanner(System.in).nextInt();
        int[] nums = new int[N];

        for(int i=0;i<N;i++){

            nums[i]=new Scanner(System.in).nextInt();
        }

        switch(opt){
            case 1 :  new Operations().add(nums);
            break;
            case 2 : new Operations().sub(nums); 
            break;
            case 3 : new Operations().mul(nums); 
            break;


        }
    }

}
