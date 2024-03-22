package TourProject;

import java.util.Scanner;

public class Main {

    public static String firstChoice;
    public static int secondChoice;
    public static String enter_exit_Choice;
    public static int counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tourist tourist = new Tourist();
        String touristName = tourist.touristName;
        int tourNumber = tourist.tourNumber;

        Container container = new Container();
        container.FloorArrayLists();

        System.out.println("\n------------------------------------------");
        System.out.println("    Welcome to Innovation Academy Tour!    ");
        System.out.println("------------------------------------------\n");

        System.out.println("\nHello " + touristName + ", Welcome to the tour of IA");
        System.out.println("This tour's number is: " + tourNumber + "\n");

        System.out.print("Do you want to start tour? (Y/N) ");
        String tourStartEnd = scanner.nextLine();

        while (tourStartEnd.equalsIgnoreCase("y")) {

            System.out.print("Do you want to navigate to the room you're in? (Y/N) ");
            firstChoice = scanner.nextLine();

            if (firstChoice.equalsIgnoreCase("Y")) {
                System.out.print("Ok, What floor are you on? (Enter 1, 2, or 3) ");
                int secondChoice = scanner.nextInt();
                scanner.nextLine();

                while (secondChoice == 1) {
                    if (secondChoice == 1) {
                        System.out.println("\nHere all the rooms on Floor 1: (Pick the room name/number that you are in)");
                        container.getF1Rooms();
                        tourist.setRoom();
                        tourist.roomInfo();
                        tourist.roomsAround();

                        System.out.print("\nWould you like to exit this room and enter one of the rooms around it? (Y/N) ");
                        enter_exit_Choice = scanner.nextLine();
                        if (enter_exit_Choice.equalsIgnoreCase("y")) {
                            counter = 0;
                        }

                        while (enter_exit_Choice.equalsIgnoreCase("y")) {
                            if (counter > 0) {
                                break;
                            }

                            if (enter_exit_Choice.equalsIgnoreCase("y")) {
                                System.out.println("Pick one of the rooms around this room to exit the current one and enter the next: ");
                                tourist.roomsAround();
                                tourist.enter_exit_setRoom();
                                tourist.roomInfo();
                                tourist.roomsAround();

                                System.out.print("\nWould you like to stay in the room (Y) or see all the rooms in this floor (N)? (Y/N) ");
                                enter_exit_Choice = scanner.nextLine();
                                if (enter_exit_Choice.equalsIgnoreCase("n")) {
                                    counter += 1;
                                    break;
                                }
                            }
                        }
                    }
                }

                while (secondChoice == 2) {
                    if (secondChoice == 2) {
                    System.out.println("Great! Here all the rooms on Floor 2: (Pick the room name/number that you are in)");
                    }
                }

                while (secondChoice == 3) {
                    if (secondChoice == 3) {
                    System.out.println("Great! Here all the rooms on Floor 4: (Pick the room name/number that you are in)");
                    }
                }
            }
            break;
        }

        System.out.println("\nOk, Thank you for visiting. Bye!");
    }
}
