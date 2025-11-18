
public class ArrayCopy {

    public static int[] copyArray(int[] n) {
        int counter = 0;
        int[] n2 = new int[n.length * 2];

        for (int i = 0; i < n.length; i++) {
            n2[counter++] = n[i];
            n2[counter++] = n[i];

        }

        return n2;

    }

    public static void main(String[] args) {
        int[] setA = { 1, 2, 3, 4, 5 };
        setA = copyArray(setA);
        for (int i = 0; i < setA.length; i++) {
            System.out.print(setA[i]);
            ;
        }
    }
}