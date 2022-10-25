public class Homework7 {
    import jdk.jfr.Description;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            enum Seasons {
                Spring, Summer, Autumn, Winter
            }

            class TrainEnumerations {

                public static void main(String[] args) {
                    Seasons season;

                    System.out.print("Season (1..4) = ");
                    Scanner inStr = new Scanner(System.in);
                    int numSeason = inStr.nextInt();

                    switch (numSeason) {
                        case 1:
                            season = Seasons.Spring;
                            break;
                        case 2:
                            season = Seasons.Summer;
                            break;
                        case 3:
                            season = Seasons.Autumn;
                            break;
                        case 4:
                            season = Seasons.Winter;
                            break;
                        default:
                            System.out.println("Incorrect input.");
                            return;
                    }

                    System.out.println("season = " + season);
                    int countOfDays = 0;

                    switch (season) {
                        case Spring:
                            countOfDays = 92;
                            break;
                        case Summer:
                            countOfDays = 92;
                            break;
                        case Autumn:
                            countOfDays = 91;
                            break;
                        case Winter:
                            countOfDays = 90;
                            break;
                    }
                    System.out.println("Number of days = " + countOfDays);

                    Description description = new Description();
                    swich(description) {
                        case Spring:
                            description = "it is good";
                            break;
                        case Summer:
                            description = " it is warm";
                            break;
                        case Autumn:
                            description = "it is my birth day";
                            break;
                        case Winter:
                            description = "it is cold";
                            break;
                    }
                    System.out.println(description);
                }
            }
        }
    }


import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            enum Seasons {
                Spring, Summer, Autumn, Winter
            }
            class TrainEnumerations {
                Scanner sc = new Scanner(System.in);
                int numSeason = sc.nextInt();
                switch(numSeason)

                {
                    case 1:
                        numSeason = Seasons.Spring;
                        break;
                    case 2:
                        numSeason = Seasons.Summer;
                        break;
                    case 3:
                        numSeason = Seasons.Autumn;
                        break;
                    case 4:
                        numSeason = Seasons.Winter;
                        break;
                    default:
                        System.out.println("Incorrect input.");
                        return;
                    System.out.println(numSeason);
                }
            }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the month: ");
                String scanData = scanner.next();
                for(Month m : Month.values()) {
                    if (scanData.equalsIgnoreCase(m.name())) {
                        System.out.println("SUCCESS");
                        System.out.println(m.getSeason());
                        String a = String.valueOf(m.getSeason());

                    }
                }
            }

        }
    }


}

    public static void main(String[] args) {

        enum Seasons {
            Spring, Summer, Autumn, Winter
        }

        class TrainEnumerations {

            public static void main(String[] args) {
                Seasons season;

                System.out.print("Season (1..4) = ");
                Scanner inStr = new Scanner(System.in);
                int numSeason = inStr.nextInt();

                switch (numSeason) {
                    case 1:
                        season = Seasons.Spring;
                        break;
                    case 2:
                        season = Seasons.Summer;
                        break;
                    case 3:
                        season = Seasons.Autumn;
                        break;
                    case 4:
                        season = Seasons.Winter;
                        break;
                    default:
                        System.out.println("Incorrect input.");
                        return;
                }

                System.out.println("season = " + season);
                int countOfDays = 0;

                switch (season) {
                    case Spring:
                        countOfDays = 92;
                        break;
                    case Summer:
                        countOfDays = 92;
                        break;
                    case Autumn:
                        countOfDays = 91;
                        break;
                    case Winter:
                        countOfDays = 90;
                        break;
                }
                System.out.println("Number of days = " + countOfDays);
            }

