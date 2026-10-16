
import java.util.Arrays;

public class LargestNoInArray {
    public static void main(String[] args) {
        int[] arr={34,155,67,23,90,21,100};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int a:arr){
            if(a<smallest){
                smallest=a;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest in the Array: "+largest);
        System.out.println("Smallest in the Array: "+smallest);
    }
}
