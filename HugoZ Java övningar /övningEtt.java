import java.util.Arrays;

public class övningEtt {

    public static void main(String[] arr) {
        int[] myArr = { 1, 2, 3, 5, 6, 4, 3, 5, 3, 23, 5, 3, 3 };
        System.out.print("( ");
        for (int value : myArr) {
            System.out.print(value + " ");
        }
        System.out.print(")");
        System.out.println();
        System.out.println("the array printed raw: " + myArr);
        System.out.println("max: " + max(myArr));
        System.out.println("min: " + min(myArr));
        System.out.println("avarage: " + avarage(myArr));
    }

    public static int max(int[] x) {
        return Arrays.stream(x).max().getAsInt();
    }

    public static int min(int[] x) {
        return Arrays.stream(x).min().getAsInt();
    }

    public static int avarage(int[] x) {
        int output = 0;
        for (int i = 0; i < x.length; i++) {
            output += x[i];
        }
        return output / x.length;
    }
}
