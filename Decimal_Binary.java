public class Decimal_Binary {
    public static void main(String[] args) {
		int decimalNo=13;
		System.out.println("13 to binary:" +Integer.toBinaryString(decimalNo)+" through Integer.toBinaryString() method");
		String binaryNo="";
		while(decimalNo>0) {
			int rem=decimalNo%2;
			System.out.println(rem);
			binaryNo=rem+binaryNo;
			decimalNo/=2;
		}
		System.out.println(binaryNo);
	}
}

/*
 * decimal number-0,1,2,3,4,5,6,7,8,9
 * binary number-0,1
 * Example: 13
 *            quotient             binary
 * 	--> 13/2=     6       remainder=  1
 * 	-->6/2=       3       remainder=  0
 * -->3/2=        1       remainder=  1
 * --> 1/2=       0       remainder=  1
 * 
 * 13 binary number is 1101
 * */
 

