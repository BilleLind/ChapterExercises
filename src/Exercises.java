import java.util.Scanner;

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


        // 1.6 write a program that displays the result of
        System.out.println("exercise 1.6");

        System.out.println("1+2+3+4+5+6+7+8+9+10 =");
        System.out.println(1+2+3+4+5+6+7+8+9+10);


         /*1.12  assume that a runner runs 24 miles in 1 hour 40 minutes and 35 second. write a program that displays
        the average speed in kilometers per hour (note 1 mile is equal to 1.6 kilometer)
         */
        System.out.println("exercise 1.12");

        float distanceMiles = 24;
        float timeSeconds = 6035;
        float distanceKilometers = (float) (distanceMiles *1.6);

        float result = distanceKilometers / (timeSeconds / 60 / 60);
        System.out.println("the runners average speed was =" + result +" Km/h");


        //chapter 2 exercises
        System.out.println("exercise 2.1");
                                                    System.out.println(" "); // space
        Scanner input =new Scanner(System.in);

        System.out.println("enter miles ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.6;

        System.out.println(kilometers + " kilometers" );
                                                    System.out.println("  ");

        System.out.println("exercise 2.2");
                                                    System.out.println(" ");
         double area;
         double height;
         double width;
        System.out.println("Enter length of the sides and height of the Equilateral");
            width = input.nextDouble();
        System.out.println("enter the height of the prism ");
            height =input.nextDouble();
            area = ((Math.sqrt(3))/4)*(Math.pow(width,2));
        System.out.println("The area is = " + area);
        System.out.println("Volume of the triangular prism =" + area * height);


        System.out.println(" exercise 2.3 ");
                                                        System.out.println(" "); // space
        double meter;
        double feet = 3.2786;
        System.out.println("Enter a value for meter");
            meter =input.nextDouble();
        System.out.println(meter + "meters is" + (meter * feet) + " feet");

        System.out.println("exercise 2.12");
        double v;
        double a;


        System.out.println(" enter speed and acceleration");
        v = input.nextDouble();
        a = input.nextDouble();
        double lenght =((Math.pow(v,2))/(2 * a));
        System.out.println("The minimun runway lenght for this airplane is "+ lenght);

                                                    System.out.println(" ");
        System.out.println(" 2.17 ");
        double tempOutside;
        double windSpeed;
        System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F");
        tempOutside =input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour :");
        windSpeed =input.nextDouble();
        double windChill = 35.74 + 0.6215 * tempOutside - 35.75 * Math.pow(v, 0.16) + 0.4275 * tempOutside * Math.pow(v, 0.16);
        System.out.println("The wind chill index is : " + windChill);

        //2.23
                                                        System.out.println("");
        System.out.println("exercise 2.23 ");
        double drivingDistance;
        double milesPerGallon;
        double pricePerGallon;
        System.out.println("Enter the driving distance : " );
        drivingDistance =input.nextDouble();
        System.out.println("Enther miles per gallon : " );
        milesPerGallon =input.nextDouble();
        System.out.println("Enthe the price per gallong : " );
        pricePerGallon =input.nextDouble();
        double cost = (drivingDistance / milesPerGallon) *pricePerGallon;
        System.out.println("The cost of driving is $" + cost);

    }
}
