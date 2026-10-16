class Factor{
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}

/*
 * any no. divisible and their remainder is 0 then it is the factor of given no.
 * 4- 1,2,4
 * 9-1,3,9
 * 11-1,11
 * 
 * given no. --->n
 * iterate(loop) - 1 to n
 * condition:n%i==0
 */