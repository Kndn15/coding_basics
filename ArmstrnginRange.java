import java.util.*;
public class ArmstrnginRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int initial=sc.nextInt();
        int last=sc.nextInt();
        
        for(int i=initial;i<=last;i++){
            int sum=0;
            int count=0;
            int j=i;
            int temp=i;
            // if(j==0){
            //     count=1;}
            while(j>0){
                count++;
                j=j/10;
            }
            while(temp>0){
                int rem=temp%10;
                sum=sum+(int)Math.pow(rem,count);
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }
            

        }
    }
}

