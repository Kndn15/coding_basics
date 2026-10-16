public class PrimeNo {
    public static void main(String[] args) {
        int n=1100;
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(n+" is a prime as factors other than itself is "+count );
        }
        else{
            System.out.println(n+" is not a prime as it has factors other than itself is "+count);
        }
    }
}



/*
 * primes: 2,3,5,7,11,....
 * the no.'s which has only 2 factors i.e. 1 and itself
 * 3: 1,3
 * 
 */