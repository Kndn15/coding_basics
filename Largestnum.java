public class Largestnum {
    public static void main(String[] args) {
        int a=100;
        int b=300;
        int c=30;
        // int largest=(a>b)?a:b;
        // System.out.println("The largest number is " +largest);
        // int fsmallest=(a<b)?((a<c)?a:c):b;
        int fsmallest=(a>b)?((b>c)?c:b):(a>c?c:a);
        System.out.println("the smallest is "+fsmallest);

    }
}
