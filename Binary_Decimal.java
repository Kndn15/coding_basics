public class Binary_Decimal {
    public static void main(String[] args) {
        int binary=1010;
        int Binary=binary;
        int power=0;
        int decimal=0;
        while(binary>0){
            int rem=binary%10;
            decimal+=rem*Math.pow(2, power++);
            binary/=10;
        }
        System.out.println("Decimal value of binary "+Binary+" :"+decimal);
    }
}



/*1 0 1 0
  4 3 2 1 ---> units positions
        getting numbers from last/ unit positions : 0 1 0 1
        multiplying each with 2 to the power of 0 to index positions
        and adding all those multiplicates/product values
        Same Ex:
            Products:   0*2^0=0
                        1*2^1=2
                        0*2^2=0
                        1*2^3=8
    Sum of Products:0+2+0+8=10
    So, 1010 decimal is 10.

*/