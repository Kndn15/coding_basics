
import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(n%sum==0){
            System.out.println(n+"  is Harshad Number");
        }else{
            System.out.println(n+"  is not a Harshad Number");

        }
    }
}



/*
 * 12-> 1+2=3
 * 12%3==0 -->Harshad no
 * 13->1+3=4
 * 13%4!=0 --> not harshad no
 */
