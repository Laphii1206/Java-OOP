package StringTest;

public class Apr2021 {
    public static void main(String[] args) {
        String message = "Covid-19 Pandemic";
        String sub;
        sub = message.substring(5, 12);
        System.out.println(sub);
        // output is -19 Pan

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        String s = "aeiou";
        // extract "ei4" from s and assign to array letter from 3rd element using String
        s.getChars(1, 3, letter, 2);
        for (char c : letter)
            System.out.print(c);
        // output is abeiefg
        String numbers = "one two three four";
        int i;
        i = numbers.indexOf('o', numbers.indexOf('o') + 1);
        // assign the index of second o in String numbers to i using String method
        System.out.println(i);
        // output is 6
    }
}
