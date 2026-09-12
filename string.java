public class string {
    static String a="hello";
    static String b="hello";
    static String c=new String("hello");

    public static void main(String[] args) {
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
    }
}
