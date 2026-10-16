import java.util.*;
public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sqr=num*num;
        // String numStr=String.valueOf(num);
        // String sqrStr=String.valueOf(sqr);
        // if(sqrStr.endsWith(numStr)){
        //     System.out.println(num + " is a automorphic number");
        // }
        // else{
        //     System.out.println(num+" is not a automorphic number");
        // }
        boolean isAutomorphic=false;
        while(num>0){
            int numrem=num%10;
            int sqrrem=sqr%10;
            if(numrem!=sqrrem){
                isAutomorphic= false;
            }else{
                isAutomorphic=true;
            }
            num/=10;
            sqr/=10;
        }
        if(isAutomorphic){
            System.out.println(n + " is a automorphic number");
        } else{
            System.out.println(n+" is not a automorphic number");
        }
    }
}





/*
 * 5*5=25 --> ends with 5 so it is automorphic
 * 6*6=36 -->6
 * 25*25=625 -->25
 * 8*8=64--> not a automorphic
 */
