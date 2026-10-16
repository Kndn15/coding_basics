import java.util.*;
public class StrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. to know strong or not");
        int n=sc.nextInt();
        int num=n;
       
        int sum=0;
        while(num>0){
            int rem=num%10;
            int fact=1;
            for(int i=rem;i>0;i--){
                fact=fact*i; 
            }
            sum=sum+fact;
            num=num/10;
            
        }
        if(sum==n){
                System.out.println("strong no.");
            }else{
                System.out.println("Not strong no.");
            }
    }
}


/*
 * strong number
 * 123:
 *  1!=1
 *  2!=2
 *  3!=6
 *  1+2+6=9
 *  if(9=123)->strong -> so no
 * 
 * 145:original
 * 1!=1,4!=24,5!=120
 * sum=1+24+120=145=original so strong no.
 */