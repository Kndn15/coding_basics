public class SumOfAnArray {
    public static void main(String[] args) {
        int []arr={10,34,45,34};
        int sum=0;
        for(int val:arr){
            System.out.print(val+" ");
            sum+=val;
        }
        
        System.out.println("\nSum of an array"+sum);
    }
}
