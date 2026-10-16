public class Duplicates {
    public static void main(String[] args) {
        int []arr={2,3,4,2,3,5,6,4};
        int count=0;
        for(int i=0;i<arr.length-1;i++){//after 6 we cant compare to any value so we take arr.length-1
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);//printing duplicate values
                    count++;
                }
            }
        }
        System.out.println("Count of duplicates: "+count);
    }
}
