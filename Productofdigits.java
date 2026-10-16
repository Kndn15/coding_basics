public class Productofdigits {
    public static void main(String[] args) {
        int a=1236;
        int product=1;
        while(a>0){
            int rem=a%10;
            product*=rem;
            a=a/10;
        }
        System.out.println(product);
    }
}
