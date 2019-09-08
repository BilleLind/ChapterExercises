public class Exercises {
    public static void main(String[] args) {

        // 1.1 (display three messages) write a program that displays Welcome to java, Learning java now and Programming is fun
        System.out.println(" exercise 1.1");

        System.out.println("Welcome to Java");
        System.out.println(" Learning Java now");
        System.out.println("Programming is Fun");

        // 1.2 write a program that displays "I love Java" five times
        System.out.println(" exercise 1.2");

        int i;
        for (i = 0; i < 5; i++)
            System.out.println("I love java");

        /* 1.3 Write a program that displats the following patterne:
            j
        j   aaa    v     vaaa
        j   j  aa    v v    a a
        j    aaaa     v     aaaa
         */
        System.out.println(" exercise 1.3");

        System.out.println("" +
                "        j   aaa    v     vaaa\n" +
                "        j   j  aa    v v    a a\n" +
                "        j    aaaa     v     aaaa");

        // 1.4 Print a table that displays the following table
        System.out.println("exercise 1.4");
        /* failed try for 1.4
        final Object[][] table = new String[5][];
        table[0] = new String[]{"a", "a^2", "a^3", "a^4"};
        table[1] = new String[]{"1", "1", "1", "1"};
        table[2] = new String[]{"2", "4", "8", "16"};
        table[3] = new String[]{"3", "9", "27", "81"};
        table[4] = new String[]{"4", "16", "64", "256"};

        for (final Object[] row : table) {
            System.out.format("%15s%15s%15s\n", row);
        }
                 */

        System.out.println("a   a^2     a^3     a^4 ");
        System.out.println("1   1       1       1   ");
        System.out.println("2   4       8       16  ");
        System.out.println("3   9       26      81  ");
        System.out.println("4   16      64      256 ");


        //1.5 write a program that displays the result of
        System.out.println("exercise 1.5");

        System.out.println("(7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5) =");
        System.out.println((7.5 * 6.5 - 4.5 * 3) / 47.5 - 5.5);





    }
}
