package W12;

public class W12_String {
    public static void main(String[] args) {
        boolean isStudent = true;
        String answer = String.valueOf(isStudent);
        String s1 = "welcomA";
        String s2 = "welcoma";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.length());
        System.out.println(s2.substring(3));
        System.out.println(s2.substring(3, 5));
        System.out.println();

        String s3 = "abcdefg";
        System.out.println(s3.startsWith("abc"));
    }
}
