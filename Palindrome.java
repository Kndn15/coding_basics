public class Palindrome {
    public static void main(String[] args) {
    int n=132;
    int num=n;
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }  
    System.out.println(rev + " "+num);
    if(num==rev){
        System.out.println("Palidrome");
    }
    else{
        System.out.println("Not a palindrome");
    }
    }
    

}
