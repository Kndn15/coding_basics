public class Armstrngno {
    public static void main(String[] args) {
        int n=153;
        int num=n;
         int temp=n;
        int count=0;
        
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=Math.pow(rem, count);
            num=num/10;
            
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("Armstrong no.");
        }else{
            System.out.println("Not an Armstrong no.");
        }
        
    }
}




/*

153-3 digits
1*1*1 + 5*5*5 + 3*3*3
1 + 125 + 27 =153 =153(original) is an armstrng
 * 143-3 digits
 * 1*1*1 + 4*4*4 + 3*3*3
 * 1+64+27=92 !=143 so not an armstrong
 */