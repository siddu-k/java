public class Operations {
    
Display D = new Display();
static int ans;

void add(int[] nums){

    for(int num :nums){
    ans+=num;
    }
    D.Display(ans,nums);
}

void sub(int[] nums){
for(int num :nums){
    ans-=num;
    }
    D.Display(ans,nums);
}

void mul(int[] nums){
   for(int num :nums){
    ans*=num;
    }
    D.Display(ans,nums);
}
}

