import java.util.Arrays;

public class codewars {

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


//best practive switch strings

class Solution {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class Order {
  public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
  }
}