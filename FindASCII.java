public class FindASCII {
    public static void main(String[] args) {
        String s="abc123%#";
        for(char c:s.toCharArray()){
            int ascii=c;
            System.out.println(c+" "+ascii);
        }
    }
}
