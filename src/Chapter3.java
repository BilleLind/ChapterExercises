import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {

        //3.4
        int month = (int) (12.0 * Math.random());
        System.out.println("The month is: " + month);
            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Error");
                    break;
            } //man skal huske ikke af smide den væk, ellers gider resten ikke køre når det er inden for xD

                 //4.5
                Scanner input = new Scanner(System.in);

                String today;
                String futereDay;

        System.out.println("Enter today's day:");
        int day =input.nextInt();
        System.out.println("Enter the number of days elapsed since today");
        int elapsed =input.nextInt();

        if (day==0)
            today = "Sunday";
        else if (day==1)
            today = "Monday";
        else if (day==2)
            today = "Tuesday";
        else if (day==3)
            today = "wednesday";
        else if (day==4)
            today = " thursday";
        else if (day==5)
            today = "Friday";
        else
            today = "Saturday";

        int calculateFutureDay =(day + elapsed) % 7;

        if (calculateFutureDay == 0)
            futereDay = "Sunday";
        else if (calculateFutureDay ==1)
            futereDay = " Monday";
        else if (calculateFutureDay == 2)
            futereDay = "Tuesday";
        else if (calculateFutureDay == 3)
            futereDay = "Wednesday";
        else if (calculateFutureDay == 4)
            futereDay = "Thursday";
        else if (calculateFutureDay == 5)
            futereDay = "Friday";
        else futereDay = "Saturday";

        System.out.println("Today is " + today + " and the future day is " + futereDay);


        //3.6
        System.out.println("Enter weight in pounds ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches ");
        double inches = input.nextDouble();

        System.out.println("Enter height in feet");
        double feet = input.nextDouble();

        double heightInches = inches + (feet * 12);

        double bmi = (weight / (Math.pow(heightInches,2)))*703;

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi <30) {
            System.out.println("Overweight");
        } else {System.out.println("Obese");}









    }
}
