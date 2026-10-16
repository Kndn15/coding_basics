
import java.util.Scanner;

public class PerfectNo{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a Perfect no.");
        }
        else{
            System.out.println(n+" is not a perfect no.");
        }
    }
}






/*
 * 6-1,2,3,6 factors (except 6 original)
 * 1+2+3=6=6(original) so 6 is perfect no
 */