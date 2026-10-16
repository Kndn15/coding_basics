public class FindLength_String {
    public static void main(String[] args) {
        String a="java";
        char []arr=a.toCharArray();
        int length=arr.length;
        System.out.println(length);
        System.out.println(a.length());
        //without using in built methods
        int strlen=0;
       try{
         while (true) { 
            a.charAt(strlen);
            strlen++;
        }
       }catch(Exception e){

       }
       System.out.println(strlen+ " without inbuilt");
       
    }
}
