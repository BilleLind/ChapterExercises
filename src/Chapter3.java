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


        // 3.14
        int number;
        int quess;

        number = (int) (Math.random()*2);

        System.out.println("Please quess if it is heads (0) or tails (1)");
        quess =input.nextInt();

        if (quess==number) {
            System.out.println("Correct quess");
        } else System.out.println("Wrong quess");

        //3.24
        int kind = (int) (Math.random()*3);
        int rank = (int) (Math.random()*12);

        String kinds;
        String ranks;

        if (kind == 0) {
            kinds = "Clubs";
        } else if (kind==1) {
            kinds = "Diamonds";
        }else if (kind==2) {
            kinds = "Hearts";
        }else {kinds = "Spades";}

        if (rank==0) {
            ranks = "ace";
        }else if (rank==1) {
            ranks = "2";
        }else if (rank==2) {
            ranks = "3";
        }else if (rank==3) {
            ranks = "4";
        }else if (rank==4) {
            ranks = "5";
        }else if (rank==5) {
            ranks = "6";
        }else if (rank==6) {
            ranks = "7";
        }else if (rank==7) {
            ranks = "8";
        }else if (rank==8) {
            ranks = "9";
        }else if (rank==9) {
            ranks = "10";
        }else if (rank==10) {
            ranks = "Jack";
        }else if (rank==11) {
            ranks = "Queen";
        }else {ranks = "King";}

        System.out.println("The card you picked is " + ranks + " of " + kinds);






    }
}
