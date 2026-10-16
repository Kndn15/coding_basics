
import java.util.Scanner;

public class AbundantNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number to know it's abundant");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
                System.out.println(" ");
                sum+=i;
            }
            
        }
        if(sum>n){
            System.out.println(n+" is an abundant no.");
        }else{
            System.out.println(n+" is not an abundant no.");

        }
    }
}

/*
 * 12->1,2,3,4,6,12
 * except the original number
 * 1+2+3+4+6=16>12 is abundant number
 */
